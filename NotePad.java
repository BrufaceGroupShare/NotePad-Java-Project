/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Notepad.java
 *
 * Created on Oct 26, 2010, 11:14:56 AM
 */



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;

/**
 *
 * @author Pham Duy Anh
 */
public class Notepad extends javax.swing.JFrame implements ActionListener{
   /** Creates new form Notepad */
    public Notepad() {
        initComponents();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMain = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        MenuItemNew = new javax.swing.JMenuItem();
        MenuItemOpen = new javax.swing.JMenuItem();
        MenuItemSave = new javax.swing.JMenuItem();
        MenuItemSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuItemExit = new javax.swing.JMenuItem();
        MenuEdit = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        MenuItemCut = new javax.swing.JMenuItem();
        MenuItemCopy = new javax.swing.JMenuItem();
        MenuItemPaste = new javax.swing.JMenuItem();
        MenuItemDelete = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        MenuItemFind = new javax.swing.JMenuItem();
        MenuItemReplace = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        MenuItemSelectAll = new javax.swing.JMenuItem();
        MenuFormat = new javax.swing.JMenu();
        MenuItemWordWrap = new javax.swing.JCheckBoxMenuItem();
        MenuItemFont = new javax.swing.JMenuItem();
        MenuItemColor = new javax.swing.JMenuItem();
        MenuItemAboutNotePad = new javax.swing.JMenu();
        MenuItemAbout = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu1.setText("File");
        jMenuBar4.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar4.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("NotePad");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtMain.setColumns(20);
        txtMain.setRows(5);
        txtMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMainMousePressed(evt);
            }
        });
        txtMain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMainKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtMain);

        MenuFile.setBorder(null);
        MenuFile.setText("File");
        MenuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFileActionPerformed(evt);
            }
        });

        MenuItemNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemNew.setText("New");
        MenuItemNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNewActionPerformed(evt);
            }
        });
        MenuFile.add(MenuItemNew);

        MenuItemOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemOpen.setText("Open");
        MenuItemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemOpenActionPerformed(evt);
            }
        });
        MenuFile.add(MenuItemOpen);

        MenuItemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemSave.setText("Save");
        MenuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSaveActionPerformed(evt);
            }
        });
        MenuFile.add(MenuItemSave);

        MenuItemSaveAs.setText("Save As...");
        MenuItemSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSaveAsActionPerformed(evt);
            }
        });
        MenuFile.add(MenuItemSaveAs);
        MenuFile.add(jSeparator1);

        MenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MenuItemExit.setText("Exit");
        MenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemExitActionPerformed(evt);
            }
        });
        MenuFile.add(MenuItemExit);

        jMenuBar1.add(MenuFile);

        MenuEdit.setText("Edit");
        MenuEdit.add(jSeparator3);

        MenuItemCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemCut.setText("Cut");
        MenuItemCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCutActionPerformed(evt);
            }
        });
        MenuEdit.add(MenuItemCut);

        MenuItemCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemCopy.setText("Copy");
        MenuItemCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCopyActionPerformed(evt);
            }
        });
        MenuEdit.add(MenuItemCopy);

        MenuItemPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemPaste.setText("Paste");
        MenuItemPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPasteActionPerformed(evt);
            }
        });
        MenuEdit.add(MenuItemPaste);

        MenuItemDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        MenuItemDelete.setText("Delete");
        MenuItemDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemDeleteActionPerformed(evt);
            }
        });
        MenuEdit.add(MenuItemDelete);
        MenuEdit.add(jSeparator4);

        MenuItemFind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemFind.setText("Find");
        MenuItemFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFindActionPerformed(evt);
            }
        });
        MenuEdit.add(MenuItemFind);

        MenuItemReplace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemReplace.setText("Replace");
        MenuItemReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemReplaceActionPerformed(evt);
            }
        });
        MenuEdit.add(MenuItemReplace);
        MenuEdit.add(jSeparator5);

        MenuItemSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemSelectAll.setText("Select All");
        MenuItemSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSelectAllActionPerformed(evt);
            }
        });
        MenuEdit.add(MenuItemSelectAll);

        jMenuBar1.add(MenuEdit);

        MenuFormat.setText("Format");

        MenuItemWordWrap.setSelected(true);
        MenuItemWordWrap.setText("Word wrap");
        MenuItemWordWrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemWordWrapActionPerformed(evt);
            }
        });
        MenuFormat.add(MenuItemWordWrap);

        MenuItemFont.setText("Font...");
        MenuItemFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFontActionPerformed(evt);
            }
        });
        MenuFormat.add(MenuItemFont);

        MenuItemColor.setText("Color");
        MenuItemColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemColorActionPerformed(evt);
            }
        });
        MenuFormat.add(MenuItemColor);

        jMenuBar1.add(MenuFormat);

        MenuItemAboutNotePad.setText("Help");

        MenuItemAbout.setText("About NotePad");
        MenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAboutActionPerformed(evt);
            }
        });
        MenuItemAboutNotePad.add(MenuItemAbout);

        jMenuBar1.add(MenuItemAboutNotePad);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFileActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MenuFileActionPerformed
    File file;
    Boolean hasChange=false;
    Boolean modeNew=true;
    private void MenuItemNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNewActionPerformed
        // TODO add your handling code here:
        if(hasChange)
        {
            int option = JOptionPane.showConfirmDialog(this, "Text has changed\n Do you want to save?","Thongbao",JOptionPane.YES_NO_CANCEL_OPTION);
            if(option==JOptionPane.CANCEL_OPTION) return;
            if(option == JOptionPane.YES_OPTION || option == JOptionPane.NO_OPTION)
            {
                if(option == JOptionPane.YES_OPTION)
                    MenuItemSaveActionPerformed(evt);
                this.txtMain.setText("");
                this.setTitle("NotePad");
                hasChange=false;
            }
        }
        else
        {
             this.txtMain.setText("");
             this.setTitle("NotePad");
             hasChange=false;
        }
        modeNew=true;
    }//GEN-LAST:event_MenuItemNewActionPerformed

    private void MenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSaveActionPerformed
        // TODO add your handling code here:
        if(modeNew)
        {
            MenuItemSaveAsActionPerformed(evt);
            return;
        }
        else
        {
            try
            {
                FileWriter fwt = new FileWriter(file);
                BufferedWriter buf = new BufferedWriter(fwt);
                buf.write(txtMain.getText());
                buf.close();
            }
            catch( IOException ex)
            {
                System.out.println("Loi ghi tep");
            }
        }
        modeNew=false;
        hasChange=false;
    }//GEN-LAST:event_MenuItemSaveActionPerformed

    private void MenuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemOpenActionPerformed
        // TODO add your handling code here:
        if(hasChange)
        {
            int option = JOptionPane.showConfirmDialog(this, "Text has changed\n Do you want to save?","Thongbao",JOptionPane.YES_NO_CANCEL_OPTION);
            if(option==JOptionPane.CANCEL_OPTION)return;
            if(option == JOptionPane.YES_OPTION || option == JOptionPane.NO_OPTION)
            {
                if(option == JOptionPane.YES_OPTION)
                    MenuItemSaveActionPerformed(evt);
            }
        }
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text file", "txt");
        fc.setFileFilter(filter);
        int option = fc.showOpenDialog(this);
        if(JFileChooser.APPROVE_OPTION==option)
        {
            file = fc.getSelectedFile();
            this.setTitle(file.toString());
            try
            {
                FileReader frd = new FileReader(file);
                BufferedReader bufreader = new BufferedReader(frd);
                char [] buffer = new char[32];
                int len=-1;
                StringBuilder container = new StringBuilder();
                try
                {
                    while((len = bufreader.read(buffer))!= -1)
                    {
                        container.append(buffer, 0, len);
                    }
                }
                catch(IOException ex)
                {
                    System.out.println("Loi doc tep");
                }
                this.txtMain.setText(container.toString());
            }
            catch(FileNotFoundException ex)
            {
                System.out.println("Loi doc tep hoac khong tim thay tep");
            }
        }
        hasChange=false;
        modeNew=false;
    }//GEN-LAST:event_MenuItemOpenActionPerformed

    private void MenuItemSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSaveAsActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter fileter = new FileNameExtensionFilter("Text file", "txt");
        fc.setFileFilter(fileter);
        int option = fc.showSaveDialog(this);
        if(JFileChooser.APPROVE_OPTION==option)
        {
            file = fc.getSelectedFile();
            if(file.exists())
            {
                int opt=JOptionPane.showConfirmDialog(this, "Ban co muon ghi de khong?","Thong bao",JOptionPane.YES_NO_CANCEL_OPTION);
                if(opt==JOptionPane.CANCEL_OPTION || opt==JOptionPane.NO_OPTION) return;
                if(opt==JOptionPane.YES_OPTION)
                    file.delete();
            }
            this.setTitle(file.toString());
            try
            {
                FileWriter fwt = new FileWriter(file);
                BufferedWriter buf = new BufferedWriter(fwt);
                buf.write(txtMain.getText());
                buf.close();
            }
            catch( IOException ex)
            {
                System.out.println("Loi ghi tep");
            }
        }
        modeNew=false;
    }//GEN-LAST:event_MenuItemSaveAsActionPerformed

    private void MenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemExitActionPerformed
        // TODO add your handling code here:
        if(hasChange)
        {
            int option = JOptionPane.showConfirmDialog(this,"Text has change\nDou you want to save?","Question",JOptionPane.YES_NO_CANCEL_OPTION);
            if(option==JOptionPane.CANCEL_OPTION) return;
            if(option==JOptionPane.YES_OPTION)
            {
                if(modeNew) MenuItemSaveAsActionPerformed(evt);
                else MenuItemSaveActionPerformed(evt);
            }
        }
        this.dispose();
    }//GEN-LAST:event_MenuItemExitActionPerformed
    
    private void MenuItemFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFontActionPerformed
        // TODO add your handling code here:
        fontChoose fc = new fontChoose(this,true);
        fc.setLocation(this.getLocation().x, this.getLocation().y+100);
        fc.setVisible(true);        
        if(fc.isOK==true)
            txtMain.setFont(fontChoose.txtPreview.getFont());
    }//GEN-LAST:event_MenuItemFontActionPerformed

 
    private void txtMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMainMousePressed
        // TODO add your handling code here:
        if(evt.getButton()==MouseEvent.BUTTON3)
        {
            JPopupMenu ppmnu=new JPopupMenu();
            JMenuItem pp1= new JMenuItem("Copy");
            pp1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
            pp1.setActionCommand("Copy");
            pp1.addActionListener(this);

            JMenuItem pp2= new JMenuItem("Cut");
            pp2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
            pp2.setActionCommand("Cut");
            pp2.addActionListener(this);

            JMenuItem pp3= new JMenuItem("Paste");
            pp3.setMnemonic(KeyEvent.VK_P);
            pp3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
            pp3.setActionCommand("Paste");
            pp3.addActionListener(this);

            JMenuItem pp4= new JMenuItem("Delete");
            pp4.setMnemonic(KeyEvent.VK_DELETE);
            pp4.setActionCommand("Delete");
            pp4.addActionListener(this);

            ppmnu.add(pp1);
            ppmnu.add(pp2);
            ppmnu.add(pp3);
            ppmnu.add(pp4);
            ppmnu.show(this.txtMain, evt.getX(), evt.getY());
        }
        

    }//GEN-LAST:event_txtMainMousePressed

    private void MenuItemColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemColorActionPerformed
        // TODO add your handling code here:
        Color newColor=JColorChooser.showDialog(this, "Select font color", this.txtMain.getForeground());
        if (newColor!=null)
            this.txtMain.setForeground(newColor);

    }//GEN-LAST:event_MenuItemColorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        hasChange=false;
        txtMain.setLineWrap(MenuItemWordWrap.getModel().isSelected());
    }//GEN-LAST:event_formWindowOpened

    private void MenuItemWordWrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemWordWrapActionPerformed
        txtMain.setLineWrap(MenuItemWordWrap.getModel().isSelected());
    }//GEN-LAST:event_MenuItemWordWrapActionPerformed

    private void txtMainKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMainKeyTyped
        // TODO add your handling code here:
        hasChange=true;
    }//GEN-LAST:event_txtMainKeyTyped
    Find find;
    private void MenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAboutActionPerformed
        // TODO add your handling code here:
        About about = new About(this,true);
        about.setLocation(this.getLocation().x, this.getLocation().y+100);
        about.setVisible(true);       
    }//GEN-LAST:event_MenuItemAboutActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
         java.awt.event.ActionEvent e = null;
        if(hasChange)
        {
            int option = JOptionPane.showConfirmDialog(this,"Text has change\nDo you want to save?","Question",JOptionPane.YES_NO_CANCEL_OPTION);
            if(option==JOptionPane.CANCEL_OPTION) return;
            else if(option==JOptionPane.YES_OPTION)
            {
                if(modeNew)
                    MenuItemSaveAsActionPerformed(e);
                else
                    MenuItemSaveActionPerformed(e);
            }
        }
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void MenuItemSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSelectAllActionPerformed
        // TODO add your handling code here:
        txtMain.selectAll();
}//GEN-LAST:event_MenuItemSelectAllActionPerformed

    private void MenuItemReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemReplaceActionPerformed
        // TODO add your handling code here:
        replace=new Replace();
        replace.setLocation(this.getLocation().x, this.getLocation().y+100);
        replace.setVisible(true);
        replace.btnFindwhat.setActionCommand("FindWhat");
        replace.btnFindwhat.addActionListener(this);
        replace.btnReplace.setActionCommand("Replace");
        replace.btnReplace.addActionListener(this);
        replace.btnReplaceAll.setActionCommand("ReplaceAll");
        replace.btnReplaceAll.addActionListener(this);
}//GEN-LAST:event_MenuItemReplaceActionPerformed

    private void MenuItemFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFindActionPerformed
        // TODO add your handling code here:
        find = new Find();
        find.setLocation(this.getLocation().x, this.getLocation().y+100);
        find.setVisible(true);
        find.btnFindwhat.setActionCommand("Findwhat");
        find.btnFindwhat.addActionListener(this);
    }//GEN-LAST:event_MenuItemFindActionPerformed

    private void MenuItemDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemDeleteActionPerformed
        // TODO add your handling code here:
        txtMain.replaceRange("", txtMain.getSelectionStart(), txtMain.getSelectionEnd());
    }//GEN-LAST:event_MenuItemDeleteActionPerformed

    private void MenuItemPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPasteActionPerformed

        txtMain.paste();
}//GEN-LAST:event_MenuItemPasteActionPerformed

    private void MenuItemCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCopyActionPerformed
        txtMain.copy();
}//GEN-LAST:event_MenuItemCopyActionPerformed

    private void MenuItemCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCutActionPerformed
        // TODO add your handling code here:
        txtMain.cut();
}//GEN-LAST:event_MenuItemCutActionPerformed
    Replace replace;
    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("Copy"))
            txtMain.copy();
        if (e.getActionCommand().equals("Cut"))
        {
            txtMain.cut();
            hasChange=true;
        }
        if (e.getActionCommand().equals("Paste"))
        {
            txtMain.paste();
            hasChange=true;
        }
        if(e.getActionCommand().equals("Delete"))
        {
            txtMain.replaceRange("", txtMain.getSelectionStart(), txtMain.getSelectionEnd());
            hasChange=true;
        }
        if(e.getActionCommand().equals("Findwhat"))
        {
            String text;
            text=find.txtFindwhat.getText();
            int pos=txtMain.getSelectionEnd();
            int pos2=txtMain.getText().indexOf(text,pos);
            txtMain.select(pos2, pos2+text.length());
            if(!txtMain.getText().contains(text) || pos>txtMain.getText().lastIndexOf(text))
                JOptionPane.showConfirmDialog(find,"Khong tim thay","Thong bao...",JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE);               
        }
        if(e.getActionCommand().equals("FindWhat"))
        {
            String text;
            text=replace.txtFindwhat.getText();
            int pos=txtMain.getSelectionEnd();
            int pos2=txtMain.getText().indexOf(text,pos);
            txtMain.select(pos2, pos2+text.length());
            if(!txtMain.getText().contains(text) || pos>txtMain.getText().lastIndexOf(text))
                JOptionPane.showConfirmDialog(replace,"Khong tim thay","Thong bao...",JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getActionCommand().equals("Replace"))
        {
            String str=replace.txtReplacewith.getText();
            String text=replace.txtFindwhat.getText();
            int pos=txtMain.getSelectionEnd();
            int pos2=txtMain.getText().indexOf(text,pos);
            if(!txtMain.getText().contains(text) || pos>txtMain.getText().lastIndexOf(text))
                JOptionPane.showConfirmDialog(replace,"Khong tim thay","Thong bao...",JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE);
            else
            {
                txtMain.select(pos2, pos2+text.length());
                txtMain.replaceRange(str,txtMain.getSelectionStart(),txtMain.getSelectionEnd());
                txtMain.select(pos2, pos2+text.length());
                hasChange=true;
            }            
        }
        if(e.getActionCommand().equals("ReplaceAll"))
        {
            String str=replace.txtReplacewith.getText();
            String text=replace.txtFindwhat.getText();
            int pos=0;
            while(pos<txtMain.getText().lastIndexOf(text))
            {
                pos=txtMain.getText().indexOf(text,0);
                txtMain.select(pos, pos+text.length());
                txtMain.replaceRange(str,txtMain.getSelectionStart(),txtMain.getSelectionEnd());
            }
        }

            
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuEdit;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JMenu MenuFormat;
    private javax.swing.JMenuItem MenuItemAbout;
    private javax.swing.JMenu MenuItemAboutNotePad;
    private javax.swing.JMenuItem MenuItemColor;
    private javax.swing.JMenuItem MenuItemCopy;
    private javax.swing.JMenuItem MenuItemCut;
    private javax.swing.JMenuItem MenuItemDelete;
    private javax.swing.JMenuItem MenuItemExit;
    private javax.swing.JMenuItem MenuItemFind;
    private javax.swing.JMenuItem MenuItemFont;
    private javax.swing.JMenuItem MenuItemNew;
    private javax.swing.JMenuItem MenuItemOpen;
    private javax.swing.JMenuItem MenuItemPaste;
    private javax.swing.JMenuItem MenuItemReplace;
    private javax.swing.JMenuItem MenuItemSave;
    private javax.swing.JMenuItem MenuItemSaveAs;
    private javax.swing.JMenuItem MenuItemSelectAll;
    private javax.swing.JCheckBoxMenuItem MenuItemWordWrap;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTextArea txtMain;
    // End of variables declaration//GEN-END:variables

}
