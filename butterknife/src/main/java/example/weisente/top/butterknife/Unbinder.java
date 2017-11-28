package example.weisente.top.butterknife;

import android.support.annotation.UiThread;

/**
 * Created by san on 2017/11/28.
 */

public interface Unbinder {
    @UiThread
    void unbind();

    Unbinder EMPTY = new Unbinder() {
        @Override
        public void unbind() {
        }
    };
}
