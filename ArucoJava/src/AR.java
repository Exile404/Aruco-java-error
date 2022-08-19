

import org.opencv.aruco.DetectorParameters;
import org.opencv.aruco.Dictionary;
import org.opencv.core.Core;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Parameter;
import java.lang.reflect.Parameter;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;
import org.opencv.aruco.Aruco;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
public class AR {
    static void findArucoMarkers(Mat image,boolean draw){
        Mat destination = new Mat();

        // Converting the image to gray scale and
        // saving it in the dst matrix
        Imgproc.cvtColor(image, destination, Imgproc.COLOR_RGB2GRAY);
        int key=Aruco.DICT_5X5_250;
        Dictionary dictionary=Aruco.getPredefinedDictionary(key);
        DetectorParameters detect=DetectorParameters.create();
        Mat ids = new Mat();


    }
    public static void main(String[] args) {
        System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
        Imgcodecs imageCodecs = new Imgcodecs();
        String file="F:\\ArucoJava\\src\\Aruco.jpg";
        Mat image = imageCodecs.imread(file);
        boolean draw=true;
        findArucoMarkers(image,draw);

    }
}
