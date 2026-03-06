import module java.desktop;

/**
 * A program for viewing images.
 */

public class ImageViewer {

    void main(){
        EventQueue.invokeLater(() -> {
            var frame = new ImageViewerFrame();
            frame.setTitle("ImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
}
//I have not finished this yet
}