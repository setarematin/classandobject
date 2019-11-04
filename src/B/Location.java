package B;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * Created by sity on 28/10/2019.
 */
public class Location {
    public int row;
    public int column;
    public double maxvalue;

    public static Location Locatlargest(double[][] a) {
        Location location = new Location();
        int w = a.length;
        int h = a[0].length;
        location.maxvalue=Double.MIN_VALUE;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (location.maxvalue < a[i][j])
                {
                    location.maxvalue = a[i][j];
                    location.row = i;
                    location.column=j;
                }

            }
        }
        return location;
    }

    @Override
    public String toString() {
        return "row " + Integer.toString(this.row) + " column " + Integer.toString(this.column) + " maxvlue " + Double.toString(this.maxvalue);
    }
}
