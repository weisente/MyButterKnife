package example.weisente.top.butterknife;

import android.app.Activity;
import android.view.View;

/**
 * Created by san on 2017/11/28.
 */

public class Utils {
    public static <T extends View> T findViewById(Activity activity, int viewId){
        return (T) activity.findViewById(viewId);
    }
}
