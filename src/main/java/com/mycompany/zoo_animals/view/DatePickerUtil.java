package com.mycompany.zoo_animals.view;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Window;
import java.time.LocalDate;
import java.time.YearMonth;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Pequeño diálogo reutilizable para elegir una fecha (yyyy-MM-dd) usando sólo
 * Swing estándar.
 */
public final class DatePickerUtil {

    private DatePickerUtil() {
    }

    public static LocalDate pickDate(java.awt.Component parent, LocalDate initial) {
        LocalDate base = initial != null ? initial : LocalDate.now();
        final LocalDate[] selected = {base};

        Window w = parent instanceof Window ? (Window) parent : javax.swing.SwingUtilities.getWindowAncestor(parent);
        JDialog dialog;
        if (w instanceof Frame f) {
            dialog = new JDialog(f, "Seleccionar fecha", true);
        } else if (w instanceof Dialog d) {
            dialog = new JDialog(d, "Seleccionar fecha", true);
        } else {
            dialog = new JDialog((Frame) null, "Seleccionar fecha", true);
        }

        // Panel principal
        JPanel container = new JPanel(new BorderLayout(5, 5));

        YearMonth[] currentYm = {YearMonth.from(base)};
        JLabel monthLabel = new JLabel();
        monthLabel.setHorizontalAlignment(SwingConstants.CENTER);
        monthLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        monthLabel.setFont(monthLabel.getFont().deriveFont(Font.BOLD, 16f));

        JPanel daysHeader = new JPanel(new GridLayout(1, 7));
        String[] dows = {"Lu", "Ma", "Mi", "Ju", "Vi", "Sa", "Do"};
        for (String s : dows) {
            JLabel l = new JLabel(s, SwingConstants.CENTER);
            l.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
            l.setFont(l.getFont().deriveFont(Font.BOLD, 13f));
            daysHeader.add(l);
        }

        JPanel daysGrid = new JPanel(new GridLayout(0, 7, 2, 2));

        final Runnable[] refillHolder = new Runnable[1];
        refillHolder[0] = () -> {
            daysGrid.removeAll();
            YearMonth ym = currentYm[0];
            monthLabel.setText(ym.getMonth().toString().substring(0, 1).toUpperCase() + ym.getMonth().toString().substring(1).toLowerCase() + " " + ym.getYear());
            LocalDate first = ym.atDay(1);
            int shift = (first.getDayOfWeek().getValue() + 6) % 7; // Monday=0
            for (int i = 0; i < shift; i++) {
                daysGrid.add(new JLabel(""));
            }
            int len = ym.lengthOfMonth();
            for (int d = 1; d <= len; d++) {
                LocalDate currentDate = ym.atDay(d);
                JButton b = new JButton(String.valueOf(d));
                b.setMargin(new java.awt.Insets(2, 2, 2, 2));
                b.setPreferredSize(new Dimension(54, 40));
                if (currentDate.equals(LocalDate.now())) {
                    // Fondo tenue para "hoy" (sin borde rojo)
                    b.setBackground(new java.awt.Color(220, 235, 250));
                }
                if (currentDate.equals(selected[0])) {
                    b.setBackground(new java.awt.Color(173, 216, 230));
                }
                b.addActionListener(ev -> {
                    selected[0] = currentDate;
                    refillHolder[0].run();
                });
                daysGrid.add(b);
            }
            daysGrid.revalidate();
            daysGrid.repaint();
        };

        JButton prevYear = new JButton("<<");
        JButton prevMonth = new JButton("<");
        JButton nextMonth = new JButton(">");
        JButton nextYear = new JButton(">>");
        prevYear.setToolTipText("Año anterior");
        nextYear.setToolTipText("Año siguiente");
        prevMonth.setToolTipText("Mes anterior");
        nextMonth.setToolTipText("Mes siguiente");
        prevYear.addActionListener(e -> {
            currentYm[0] = currentYm[0].minusYears(1);
            refillHolder[0].run();
        });
        nextYear.addActionListener(e -> {
            currentYm[0] = currentYm[0].plusYears(1);
            refillHolder[0].run();
        });
        prevMonth.addActionListener(e -> {
            currentYm[0] = currentYm[0].minusMonths(1);
            refillHolder[0].run();
        });
        nextMonth.addActionListener(e -> {
            currentYm[0] = currentYm[0].plusMonths(1);
            refillHolder[0].run();
        });

        monthLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        monthLabel.setToolTipText("Click para seleccionar mes/año");
        monthLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // Dialogo selección mes/año
                JDialog sel = new JDialog(dialog, "Seleccionar mes/año", true);
                JPanel p = new JPanel(new BorderLayout(5, 5));
                Integer startYear = currentYm[0].getYear();
                SpinnerNumberModel yearModel = new SpinnerNumberModel(Integer.valueOf(startYear), Integer.valueOf(1900), Integer.valueOf(2100), Integer.valueOf(1));
                JSpinner yearSpin = new JSpinner(yearModel);
                String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
                JComboBox<String> monthCombo = new JComboBox<>(meses);
                monthCombo.setSelectedIndex(currentYm[0].getMonthValue() - 1);
                JPanel centerSel = new JPanel();
                centerSel.add(new JLabel("Mes:"));
                centerSel.add(monthCombo);
                centerSel.add(new JLabel("Año:"));
                centerSel.add(yearSpin);
                JPanel southSel = new JPanel();
                JButton okSel = new JButton("OK");
                JButton cancelSel = new JButton("Cancelar");
                southSel.add(okSel);
                southSel.add(cancelSel);
                okSel.addActionListener(ev -> {
                    int y = (Integer) yearSpin.getValue();
                    int m = monthCombo.getSelectedIndex() + 1;
                    currentYm[0] = YearMonth.of(y, m);
                    refillHolder[0].run();
                    sel.dispose();
                });
                cancelSel.addActionListener(ev -> sel.dispose());
                p.add(centerSel, BorderLayout.CENTER);
                p.add(southSel, BorderLayout.SOUTH);
                p.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
                sel.getContentPane().add(p);
                sel.pack();
                sel.setLocationRelativeTo(dialog);
                sel.setVisible(true);
            }
        });

        JPanel top = new JPanel(new BorderLayout());
        JPanel leftBtns = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 2));
        leftBtns.add(prevYear);
        leftBtns.add(prevMonth);
        JPanel rightBtns = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 2, 2));
        rightBtns.add(nextMonth);
        rightBtns.add(nextYear);
        top.add(leftBtns, BorderLayout.WEST);
        top.add(monthLabel, BorderLayout.CENTER);
        top.add(rightBtns, BorderLayout.EAST);

        JPanel calendarPanel = new JPanel(new BorderLayout(0, 2));
        calendarPanel.add(top, BorderLayout.NORTH);
        calendarPanel.add(daysHeader, BorderLayout.CENTER);
        calendarPanel.add(daysGrid, BorderLayout.SOUTH);

        refillHolder[0].run();

        JPanel south = new JPanel();
        JButton ok = new JButton("OK");
        JButton cancel = new JButton("Cancelar");
        south.add(ok);
        south.add(cancel);
        ok.addActionListener(e -> dialog.dispose());
        cancel.addActionListener(e -> {
            selected[0] = null;
            dialog.dispose();
        });

        container.add(calendarPanel, BorderLayout.CENTER);
        container.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        dialog.getContentPane().add(container, BorderLayout.CENTER);
        dialog.getContentPane().add(south, BorderLayout.SOUTH);
        dialog.pack();
        // Asegurar ancho suficiente para mostrar el texto completo del mes/año
        if (dialog.getWidth() < 500) {
            dialog.setSize(new Dimension(500, dialog.getHeight() + 40));
        }
        dialog.setLocationRelativeTo(parent);
        dialog.setVisible(true);
        return selected[0];
    }
}
