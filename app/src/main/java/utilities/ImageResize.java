package utilities;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mathgame.R;

public class ImageResize extends AppCompatActivity {
    public static Drawable resize(Context context, Drawable image, int coordinateX, int coordinateY) {
        Bitmap b = ((BitmapDrawable)image).getBitmap();
        Bitmap bitmapResized = Bitmap.createScaledBitmap(b, coordinateX, coordinateY, false);
        return new BitmapDrawable(context.getResources(), bitmapResized);
    }


}
