import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.myapplication.R;

public class SlideViewPagerAdapter extends PagerAdapter {
    Context ctx;

    public SlideViewPagerAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater= (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.activity_onboarding,container,false);

        ImageView logo=view.findViewById(R.id.logo1);
        ImageView dots1=view.findViewById(R.id.dots1);
        ImageView dots2=view.findViewById(R.id.dots2);
        ImageView dots3=view.findViewById(R.id.dots3);

        TextView text1=view.findViewById(R.id.text1);
        TextView text2=view.findViewById(R.id.text2);

        Button btn_next=view.findViewById(R.id.btn1);
        Button btn_skip-view.findViewById(R.id.btn2);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
