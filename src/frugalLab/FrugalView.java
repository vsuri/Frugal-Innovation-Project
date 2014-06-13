/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frugalLab;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Hinsen Chan
 */
public class FrugalView extends javax.swing.JFrame {
    private FrugalController frugalController;
    private SearchPanel searchPanel;
    private ResultPanel resultPanel;
    private SearchResultPanel searchResultPanel;
    private MediaViewPanel mediaViewPanel;
    private OtherDataViewPanel otherDataViewPanel;
    private StatPanel statPanel;
    private FilterPanel filterPanel;
    private LoginPanel loginPanel;
    private ManagePanel managePanel;
    private UserManagerPanel userManagerPanel;
    private ProjectPanel projectPanel;
    private StudentsPanel studentsPanel;
    private PartnersPanel partnersPanel;
    private AdvisorsPanel advisorsPanel;
    private CategoryPanel categoryPanel;    
    private TagPanel tagPanel;
    private MediaPanel mediaPanel;
    private FileTypePanel fileTypePanel;
    private OtherDataPanel otherDataPanel;
    
    /**
     * Creates new form TestView
     */
    public FrugalView() {
        initComponents();
        frugalController = new FrugalController(this);
        setupPanels();
        setupMainPanel();
        setupResultPanel();
    }
    
    public void upFilters()
    {
        searchPanel.populateFilters();
        //refreshSearchResultPanel();

    }
            
    public void populateFilters()
    {
        String[] s = {" "};
                
        filterPanel.setStatusComboBox(s);
        filterPanel.setStartDateTextField("");
        filterPanel.setEndDateTextField("");
        filterPanel.setCategoryComboBox(s);
        filterPanel.setTagList(s);
        filterPanel.setStudentsList(s);
        filterPanel.setPartnersList(s);
        filterPanel.setAdvisorsList(s);
        filterPanel.setMediaList(s);
        
        //refreshSearchResultPanel();
    }
    
    public void updateCounts(String startDate, String projectCount, String statusCount, String categoryCount, String tagCount, String endDate, String studentsCount, String partnersCount, String advisorsCount)
    {

        // Update statPanel
        
        statPanel.setAdvisorsCountTextArea(advisorsCount);
        statPanel.setCategoryCountTextArea(categoryCount);
        statPanel.setCategoryCountTextArea1(statusCount);
        statPanel.setEndDateTextField(endDate);
        statPanel.setStartDateTextField(startDate);
        statPanel.setPartnersCountTextArea(partnersCount);
        statPanel.setProjectCountTextField(projectCount);
        statPanel.setStudentsCountTextArea(studentsCount);
        statPanel.setTagCountTextArea(tagCount);

        
    }
    
    public void refreshSearchResultPanel()
    {
       // initComponents();
       // frugalController = new FrugalController(this);
        //setupPanels();
        //setupMainPanel();
        //setupResultPanel();
        //setSearchResultPanel(new SearchResultPanel(frugalController));
        //searchResultPanel = new SearchResultPanel(frugalController);
        searchPanel.getS().getSearchResultTableModel().updateTableModel();
        
    }
    
    public void refreshMediaViewPanel()
    {
        //System.out.println("From View --" + frugalController.getPid());
        frugalController.setPid(searchResultPanel.getProjectIDTextField());
        //mediaViewPanel = new MediaViewPanel(frugalController);
        mediaViewPanel.getS().getMediaViewTableModel().updateViewTableModel(searchResultPanel.getProjectIDTextField());

        //mediaViewPanel.setProjectID(searchResultPanel.getProjectIDTextField());
    }
    
    public void setupPanels() {
        SearchResultPanel s = new SearchResultPanel(frugalController);
        setSearchResultPanel(s);

        setSearchPanel(new SearchPanel(frugalController, s.getTableController()));
        setResultPanel(new ResultPanel(frugalController));
        //ResultPanel.setResultPanel(s);
        setMediaViewPanel(new MediaViewPanel(frugalController));
        setOtherDataViewPanel(new OtherDataViewPanel(frugalController));        
        setStatPanel(new StatPanel(frugalController));
        setFilterPanel(new FilterPanel(frugalController));
        setLoginPanel(new LoginPanel(frugalController));
        setManagePanel(new ManagePanel(frugalController));
        setUserManagerPanel(new UserManagerPanel(frugalController));
        setProjectPanel(new ProjectPanel(frugalController));
        //setStudentsPanel(new StudentsPanel(frugalController));
        //setPartnersPanel(new PartnersPanel(frugalController));        
        //setAdvisorsPanel(new AdvisorsPanel(frugalController));         
        setCategoryPanel(new CategoryPanel(frugalController));         
        setTagPanel(new TagPanel(frugalController));
        //setMediaPanel(new MediaPanel(frugalController));
        setFileTypePanel(new FileTypePanel(frugalController));
        //setOtherDataPanel(new OtherDataPanel(frugalController));
    }
    
    public void setupMainPanel() {
        mainPanel.add(new BannerPanel(), "BannerPanel");
        mainPanel.add(getSearchPanel(), "SearchPanel");
        mainPanel.add(getResultPanel(), "ResultPanel");
        mainPanel.add(getMediaViewPanel(), "MediaViewPanel");   
        mainPanel.add(getOtherDataViewPanel(), "OtherDataViewPanel");
        mainPanel.add(getFilterPanel(), "FilterPanel");
        mainPanel.add(getLoginPanel(), "LoginPanel");
        mainPanel.add(getManagePanel(), "ManagePanel");
        mainPanel.add(getUserManagerPanel(), "UserManagerPanel");
        mainPanel.add(getProjectPanel(), "ProjectPanel");
        //mainPanel.add(getStudentsPanel(), "StudentsPanel");        
        //mainPanel.add(getPartnersPanel(), "PartnersPanel");          
        //mainPanel.add(getAdvisorsPanel(), "AdvisorsPanel");            
        mainPanel.add(getCategoryPanel(), "CategoryPanel");          
        mainPanel.add(getTagPanel(), "TagPanel");
        //mainPanel.add(getMediaPanel(), "MediaPanel");
        mainPanel.add(getFileTypePanel(), "FileTypePanel");
        //mainPanel.add(getOtherDataPanel(), "OtherDataPanel");
        ((CardLayout)mainPanel.getLayout()).show(mainPanel, "BannerPanel");        
    }
    
    public void setupResultPanel() {
        resultPanel.getResultPanel().add(searchResultPanel);
        resultPanel.getStatPanel().add(statPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        topPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        menuPanelLogo = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        filiterButton = new javax.swing.JButton();
        manageButton = new javax.swing.JButton();
        scrollPanePanel = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPanel.setBackground(java.awt.Color.white);
        menuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuPanel.setLayout(new java.awt.GridBagLayout());

        menuPanelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuPanelLogo.setIcon(new javax.swing.ImageIcon("/home/fattymcphatfat/NetBeansProjects/coen275project/Frugal_Blk_BriteRed_72dpi.jpg")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 47;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 13, 0);
        menuPanel.add(menuPanelLogo, gridBagConstraints);

        searchButton.setBackground(new java.awt.Color(240, 221, 0));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 18, 0, 0);
        menuPanel.add(searchButton, gridBagConstraints);

        filiterButton.setBackground(new java.awt.Color(241, 98, 35));
        filiterButton.setText("Filter");
        filiterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filiterButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 125;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 18, 0, 0);
        menuPanel.add(filiterButton, gridBagConstraints);

        manageButton.setBackground(new java.awt.Color(225, 26, 33));
        manageButton.setText("Manage");
        manageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 105;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 18, 0, 36);
        menuPanel.add(manageButton, gridBagConstraints);

        mainPanel.setBackground(new java.awt.Color(143, 19, 21));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainPanel.setMinimumSize(new java.awt.Dimension(1024, 768));
        mainPanel.setPreferredSize(new java.awt.Dimension(1024, 768));
        mainPanel.setLayout(new java.awt.CardLayout());
        scrollPane.setViewportView(mainPanel);

        javax.swing.GroupLayout scrollPanePanelLayout = new javax.swing.GroupLayout(scrollPanePanel);
        scrollPanePanel.setLayout(scrollPanePanelLayout);
        scrollPanePanelLayout.setHorizontalGroup(
            scrollPanePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane)
        );
        scrollPanePanelLayout.setVerticalGroup(
            scrollPanePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
                    .addComponent(scrollPanePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        frugalController.launchSearchPanel();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void filiterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filiterButtonActionPerformed
        //populateFilters();
        frugalController.launchFilterPanel();
    }//GEN-LAST:event_filiterButtonActionPerformed

    private void manageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageButtonActionPerformed
        if (frugalController.isLoggedIn()) {
            frugalController.launchManagePanel();
        }
        else
            frugalController.launchLoginPanel();
    }//GEN-LAST:event_manageButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrugalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrugalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrugalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrugalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrugalView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton filiterButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton manageButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel menuPanelLogo;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPanel scrollPanePanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the mainPanel
     */
    public javax.swing.JPanel getMainPanel() {
        return mainPanel;
    }

    /**
     * @param mainPanel the mainPanel to set
     */
    public void setMainPanel(javax.swing.JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }        

    /**
     * @return the searchPanel
     */
    public SearchPanel getSearchPanel() {
        return searchPanel;
    }

    /**
     * @param searchPanel the searchPanel to set
     */
    public void setSearchPanel(SearchPanel searchPanel) {
        this.searchPanel = searchPanel;
    }
    
        /**
     * @return the resultPanel
     */
    public ResultPanel getResultPanel() {
        return resultPanel;
    }

    /**
     * @param resultPanel the resultPanel to set
     */
    public void setResultPanel(ResultPanel resultPanel) {
        this.resultPanel = resultPanel;
    }
    
    /**
     * @return the searchResultPanel
     */
    public SearchResultPanel getSearchResultPanel() {
        return searchResultPanel;
    }

    /**
     * @param searchResultPanel the searchResultPanel to set
     */
    public void setSearchResultPanel(SearchResultPanel searchResultPanel) {
        this.searchResultPanel = searchResultPanel;
    }
    
    /**
     * @return the mediaViewPanel
     */
    public MediaViewPanel getMediaViewPanel() {
        return mediaViewPanel;
    }

    /**
     * @param mediaViewPanel the mediaViewPanel to set
     */
    public void setMediaViewPanel(MediaViewPanel mediaViewPanel) {
        this.mediaViewPanel = mediaViewPanel;
    }    
    
    /**
     * @return the otherDataViewPanel
     */
    public OtherDataViewPanel getOtherDataViewPanel() {
        return otherDataViewPanel;
    }

    /**
     * @param otherDataViewPanel the otherDataViewPanel to set
     */
    public void setOtherDataViewPanel(OtherDataViewPanel otherDataViewPanel) {
        this.otherDataViewPanel = otherDataViewPanel;
    }    
    
    /**
     * @return the statPanel
     */
    public StatPanel getStatPanel() {
        return statPanel;
    }

    /**
     * @param statPanel the statPanel to set
     */
    public void setStatPanel(StatPanel statPanel) {
        this.statPanel = statPanel;
    }
    
    /**
     * @return the filterPanel
     */
    public FilterPanel getFilterPanel() {
        return filterPanel;
    }

    /**
     * @param filterPanel the filterPanel to set
     */
    public void setFilterPanel(FilterPanel filterPanel) {
        this.filterPanel = filterPanel;
    }

    /**
     * @return the loginPanel
     */
    public LoginPanel getLoginPanel() {
        return loginPanel;
    }

    /**
     * @param loginPanel the loginPanel to set
     */
    public void setLoginPanel(LoginPanel loginPanel) {
        this.loginPanel = loginPanel;
    }

    /**
     * @return the managePanel
     */
    public ManagePanel getManagePanel() {
        return managePanel;
    }

    /**
     * @param managePanel the managePanel to set
     */
    public void setManagePanel(ManagePanel managePanel) {
        this.managePanel = managePanel;
    }

    /**
     * @return the userManagerPanel
     */
    public UserManagerPanel getUserManagerPanel() {
        return userManagerPanel;
    }

    /**
     * @param userManagerPanel the userManagerPanel to set
     */
    public void setUserManagerPanel(UserManagerPanel userManagerPanel) {
        this.userManagerPanel = userManagerPanel;
    }    

    /**
     * @return the projectPanel
     */
    public ProjectPanel getProjectPanel() {
        return projectPanel;
    }

    /**
     * @param projectPanel the projectPanel to set
     */
    public void setProjectPanel(ProjectPanel projectPanel) {
        this.projectPanel = projectPanel;
    }

    /**
     * @return the studentsPanel
     */
    public StudentsPanel getStudentsPanel() {
        return studentsPanel;
    }

    /**
     * @param studentsPanel the studentsPanel to set
     */
    public void setStudentsPanel(StudentsPanel studentsPanel) {
        this.studentsPanel = studentsPanel;
    }
    
    /**
     * @return the partnersPanel
     */
    public PartnersPanel getPartnersPanel() {
        return partnersPanel;
    }

    /**
     * @param partnersPanel the partnersPanel to set
     */
    public void setPartnersPanel(PartnersPanel partnersPanel) {
        this.partnersPanel = partnersPanel;
    }
    
    /**
     * @return the advisorsPanel
     */
    public AdvisorsPanel getAdvisorsPanel() {
        return advisorsPanel;
    }

    /**
     * @param advisorsPanel the advisorsPanel to set
     */
    public void setAdvisorsPanel(AdvisorsPanel advisorsPanel) {
        this.advisorsPanel = advisorsPanel;
    }
    
    /**
     * @return the categoryPanel
     */
    public CategoryPanel getCategoryPanel() {
        return categoryPanel;
    }

    /**
     * @param categoryPanel the categoryPanel to set
     */
    public void setCategoryPanel(CategoryPanel categoryPanel) {
        this.categoryPanel = categoryPanel;
    }    
    
    /**
     * @return the tagPanel
     */
    public TagPanel getTagPanel() {
        return tagPanel;
    }

    /**
     * @param tagPanel the tagPanel to set
     */
    public void setTagPanel(TagPanel tagPanel) {
        this.tagPanel = tagPanel;
    }

    /**
     * @return the mediaPanel
     */
    public MediaPanel getMediaPanel() {
        return mediaPanel;
    }

    /**
     * @param mediaPanel the mediaPanel to set
     */
    public void setMediaPanel(MediaPanel mediaPanel) {
        this.mediaPanel = mediaPanel;
    }

    /**
     * @return the fileTypePanel
     */
    public FileTypePanel getFileTypePanel() {
        return fileTypePanel;
    }

    /**
     * @param fileTypePanel the fileTypePanel to set
     */
    public void setFileTypePanel(FileTypePanel fileTypePanel) {
        this.fileTypePanel = fileTypePanel;
    }
    
    /**
     * @return the otherDataPanel
     */
    public OtherDataPanel getOtherDataPanel() {
        return otherDataPanel;
    }

    /**
     * @param otherDataPanel the otherDataPanel to set
     */
    public void setOtherDataPanel(OtherDataPanel otherDataPanel) {
        this.otherDataPanel = otherDataPanel;
    }
}
