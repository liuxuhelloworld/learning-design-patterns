package proxy.virtual;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class ImageProxyTest {
    private ImageComponent imageComponent;
    private JFrame frame = new JFrame("CD Cover Viewer");
    private JMenuBar menuBar;
    private JMenu menu;
    private HashMap<String, String> cds = new HashMap<>();

    public ImageProxyTest() throws Exception {
        cds.put("test1", "https://cn.bing.com/th?id=OIP.jmQT4hhUoHssuZm8cPIGUgHaEp&pid=Api&rs=1");
        cds.put("test2", "http://www.basketwallpapers.com/Images-05/Lakers-Roster-2008-09-Wallpaper.jpg");
        cds.put("test3", "https://cn.bing.com/th?id=OIP.fPN93tvFUlMeoIUIp4G96gHaFh&pid=Api&rs=1");

        URL initial = new URL(cds.get("test1"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (String name : cds.keySet()) {
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            Icon icon = new ImageProxy(getCDUrl(name));
            menuItem.addActionListener(event -> {
                imageComponent.setIcon(icon);
                frame.repaint();
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
            return new URL(cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws Exception {
        ImageProxyTest test = new ImageProxyTest();
    }
}
