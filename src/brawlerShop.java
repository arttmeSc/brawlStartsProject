import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class brawlerShop {
    private JLabel choseText;
    private JButton addButton;
    private JButton removeButton;
    private JList cartList;
    private JPanel mainPanel;
    private JLabel bigPapaLabel;
    private JLabel photo;
    private JList<String> infoList;
    private JComboBox comboBox1;
    private JButton buyButton;
    private JTextField userName;
    private DefaultListModel<String> listModel;

    private leon leonObj = new leon("Legendary", 3200, 7, 10, 2, 6,1000);
    private Poco pocoObj = new Poco("Rare",6000, 7, 6, 1, 800, 2000);
    private Dynomike dynoObj = new Dynomike("Common" , 2700, 9, 6, 2, true, 1400);



    private DefaultListModel<String> infoModel;
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorld");
        frame.setContentPane(new brawlerShop().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setSize(600, 700);
        frame.setVisible(true);

    }



    private void createUIComponents() {
//        infoModel = new DefaultListModel<>();
//
//        infoList = new JList<>(infoModel);
//



    }
    public brawlerShop() {

        infoModel = new DefaultListModel<>();
        infoList.setModel(infoModel);


        comboBox1.addItem("Leon");
        comboBox1.addItem("Poco");
        comboBox1.addItem("Dynomike");


        comboBox1.addActionListener(e -> updateInfo());


        listModel = new DefaultListModel<>();
        cartList.setModel(listModel);
        addButton.addActionListener(e -> {

            String selected = (String) comboBox1.getSelectedItem();

            int price = getSelectedPrice(selected);

            listModel.addElement(selected + " - " + price + " coins");

        });
        buyButton.addActionListener(e -> { saveCartToFile();
        });
        removeButton.addActionListener(e -> {
            if (!listModel.isEmpty()) {
                int lastIndex = listModel.getSize() - 1;

                listModel.remove(lastIndex); // удаляем из списка GUI
            } else {
                showError("List is empty!");
            }
        });
    }
    private void updateInfo() {
        String selected = (String) comboBox1.getSelectedItem();

        infoModel.clear();
        if ("Leon".equals(selected)) {

            String[] info = leonObj.getLeonInfo();

            for (int i = 0; i < info.length; i++) {
                String s = info[i];
                infoModel.addElement(s);

            }
            photo.setIcon(new ImageIcon(
                    "E:\\2025_26\\11_klase\\jefry artem files\\brawlStartsProject\\out\\production\\brawlStartsProject\\getting-leon-brawl-stars.png"            ));

        }
        if ("Poco".equals(selected)) {

            String[] info = pocoObj.getPocoInfo();

            for (int i = 0; i < info.length; i++) {
                String s = info[i];
                infoModel.addElement(s);
            }
            photo.setIcon(new ImageIcon(
            "E:\\2025_26\\11_klase\\jefry artem files\\brawlStartsProject\\out\\production\\brawlStartsProject\\getting-poco-Brawl-Stars.png"            ));

        }
        if ("Dynomike".equals(selected)) {

            String[] info = dynoObj.getDynoInfo();

            for (int i = 0; i < info.length; i++) {
                String s = info[i];
                infoModel.addElement(s);
            }
            photo.setIcon(new ImageIcon(
                    "E:\\2025_26\\11_klase\\jefry artem files\\brawlStartsProject\\out\\production\\brawlStartsProject\\dynomike.png"            ));
        }
    }
    private int getSelectedPrice(String selected) {
        switch (selected) {
            case "Leon":
                return leonObj.getPrice();

            case "Poco":
                return pocoObj.getPrice();

            case "Dynomike":
                return dynoObj.getPrice();
        }

        return 0;
    }
    public static void showError(String message) {
        JOptionPane.showMessageDialog(
                null,
                message,
                "error",
                JOptionPane.ERROR_MESSAGE
        );

    }
    private void saveCartToFile() {
        try {

            String username = userName.getText().trim();

            if (username.isEmpty()) {
                showError("Enter username!");
                return;
            }
            if (username.equals("Input Your Username")) {
                showError("Enter real username!");
                return;
            }
            FileWriter writer = new FileWriter("cart.txt", true);

            writer.write("-------------------------\n");
            writer.write("User: " + username + "\n");

            for (int i = 0; i < listModel.size(); i++) {
                writer.write(listModel.getElementAt(i) + "\n");
            }

            writer.close();

            JOptionPane.showMessageDialog(
                    null,
                    "Cart saved to file!"
            );
            userName.setText("");
            listModel.clear();

        } catch (IOException e) {
            showError("Error saving file!");
        }
    }
}

