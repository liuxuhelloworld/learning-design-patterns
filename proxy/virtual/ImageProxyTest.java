package proxy.virtual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTest {
    private ImageComponent imageComponent;
    private JFrame frame = new JFrame("CD Cover Viewer");
    private JMenuBar menuBar;
    private JMenu menu;
    private Hashtable<String, String> cds = new Hashtable<>();

    public ImageProxyTest() throws Exception {
        cds.put("test1", "https://cn.bing.com/th?id=OIP.jmQT4hhUoHssuZm8cPIGUgHaEp&pid=Api&rs=1");
        cds.put("test2", "http://www.basketwallpapers.com/Images-05/Lakers-Roster-2008-09-Wallpaper.jpg");
        cds.put("test3", "https://clutchpoints.com/wp-content/uploads/2018/11/lebron1.jpg");

        URL initial = new URL(cds.get("test1"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration e = cds.keys(); e.hasMoreElements(); ) {
            String name = (String)e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(e.getActionCommand())));
                    frame.repaint();
                }
            });
        }

        Icon icon = new ImageProxy(initial);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    private URL getCDUrl(String name) {
        try {
            return new URL((String)cds.get(name));
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws Exception {
        ImageProxyTest test = new ImageProxyTest();
    }
}
