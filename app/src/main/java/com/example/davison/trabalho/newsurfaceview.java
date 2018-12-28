package com.example.davison.trabalho;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;


public class newsurfaceview extends SurfaceView {


    private boolean playing=true;

    public newsurfaceview(Context context) {
        super(context);
        new Anim().start();
    }



    private class Anim extends Thread{
        int counter = 0;

        @Override
        public void run() {
            long last_updated_time = 0;
            long delay = 100;
            int img_ids[]= {
                    R.drawable.walk_1,
                    R.drawable.walk_2,
                    R.drawable.walk_3,
                    R.drawable.walk_4,
                    R.drawable.walk_5,
                    R.drawable.walk_6,
                    R.drawable.walk_7,
                    R.drawable.walk_8
            };

            while(true){
                if(playing){
                    long current_time = System.currentTimeMillis();
                    if(current_time > last_updated_time+delay){
                        if(counter >= 7){
                            counter = 0;
                        }
                        draw(img_ids[counter]);
                        last_updated_time = current_time;
                        counter++;
                    }
                }
            }
        }

        private void draw (int img_ids){
            SurfaceHolder holder = getHolder();
            Canvas canvas = holder.lockCanvas();
            if(canvas != null){
                canvas.drawColor(Color.WHITE);
                Paint paint = new Paint();
                Bitmap bitmap = BitmapFactory.decodeResource(getContext().getResources()
                        , img_ids);
                canvas.drawBitmap(bitmap, 100,100,paint);
                holder.unlockCanvasAndPost(canvas);
            }

        }


    }


}
