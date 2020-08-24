package anikrakib_fonts_material;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class Thin_EditText extends AppCompatTextView {
    public Thin_EditText(Context context) {
        super(context);
        init();
    }

    public Thin_EditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Thin_EditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setLineSpacing(0, 0.9f);

        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Regular.ttf");
            setTypeface(tf);
        }
    }
}
