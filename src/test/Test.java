/*
 * Created by JFormDesigner on Sat Nov 05 16:20:30 EDT 2011
 */

package test;

import org.jdesktop.layout.GroupLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @author Matt Wilbur
 */
public class Test extends JFrame {
    public Test() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        menuBar1 = new JMenuBar();
        menu = new JMenu();
        clear_menu_item = new JMenuItem();
        edit_menu_item = new JMenuItem();
        quit_menu_item = new JMenuItem();
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        scrollPane1 = new JScrollPane();
        card_pane = new JTextPane();
        buttonBar = new JPanel();
        edit_indicator = new JRadioButton();
        prev_button = new JButton();
        next_button = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== menuBar1 ========
        {

            //======== menu ========
            {
                menu.setText("Monkey do");

                //---- clear_menu_item ----
                clear_menu_item.setText("Clear");
                menu.add(clear_menu_item);

                //---- edit_menu_item ----
                edit_menu_item.setText("Edit");
                edit_menu_item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.ALT_MASK));
                menu.add(edit_menu_item);

                //---- quit_menu_item ----
                quit_menu_item.setText("Quit");
                quit_menu_item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.ALT_MASK));
                menu.add(quit_menu_item);
            }
            menuBar1.add(menu);
        }
        contentPane.add(menuBar1, BorderLayout.NORTH);

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //======== scrollPane1 ========
                {

                    //---- card_pane ----
                    card_pane.setContentType("text/html");
                    card_pane.setEditable(false);
                    scrollPane1.setViewportView(card_pane);
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .add(GroupLayout.TRAILING, scrollPane1, GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .add(scrollPane1, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 0, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- edit_indicator ----
                edit_indicator.setText("editing");
                edit_indicator.setEnabled(false);
                buttonBar.add(edit_indicator, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- prev_button ----
                prev_button.setText("Prev");
                buttonBar.add(prev_button, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- next_button ----
                next_button.setText("Next");
                buttonBar.add(next_button, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    private JMenuBar menuBar1;
    private JMenu menu;
    private JMenuItem clear_menu_item;
    private JMenuItem edit_menu_item;
    private JMenuItem quit_menu_item;
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JScrollPane scrollPane1;
    private JTextPane card_pane;
    private JPanel buttonBar;
    private JRadioButton edit_indicator;
    private JButton prev_button;
    private JButton next_button;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
