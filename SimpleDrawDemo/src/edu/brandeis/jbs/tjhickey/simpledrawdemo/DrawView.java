package edu.brandeis.jbs.tjhickey.simpledrawdemo;

import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Point;

public class DrawView extends View {
	
	Paint mPaint;
	Point p = new Point(50,150);
	
	public DrawView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		// Set up default Paint values
		mPaint = new Paint();
		mPaint.setAntiAlias(true);


		
		
	}
	
	@Override
	public void onDraw(Canvas canvas) {
		// Calculate geometry
		int w = getWidth();
		int h = getHeight();
		mPaint.setStyle(Style.FILL);
		mPaint.setColor(Color.RED);
		canvas.drawRect(0, 0,w,h,mPaint);
		mPaint.setColor(Color.BLUE);
		canvas.drawCircle(p.x,p.y,50,mPaint);

	}
	
	
}
