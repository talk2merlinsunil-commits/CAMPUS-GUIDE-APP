package com.example.campus_guide_app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class RouteView extends View {

    private final List<Float> points =
            new ArrayList<>();

    private Paint paint;

    public RouteView(Context context) {
        super(context);
        init();
    }

    public RouteView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {

        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(8f);
        paint.setAntiAlias(true);
    }

    public void setRoute(List<Float> routePoints) {

        points.clear();
        points.addAll(routePoints);

        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        for (int i = 0; i < points.size() - 3; i += 2) {

            float x1 = points.get(i);
            float y1 = points.get(i + 1);

            float x2 = points.get(i + 2);
            float y2 = points.get(i + 3);

            canvas.drawLine(
                    x1,
                    y1,
                    x2,
                    y2,
                    paint
            );
        }
    }
}