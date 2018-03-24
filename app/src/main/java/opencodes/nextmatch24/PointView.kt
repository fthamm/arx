package opencodes.nextmatch24

import android.content.ClipData
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.text.TextPaint
import android.util.AttributeSet
import android.util.Log
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View

class PointView: View{

    var whitePaint: Paint = Paint()
    var redPaint: Paint = Paint()
    var r: Float = 48F

    var x0: Float = Float.MAX_VALUE
    var y0: Float = Float.MAX_VALUE

    constructor(context: Context): super(context) {
        init()
        setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent): Boolean {
                Log.e("clicked", event.actionMasked.toString())
                x0 = event.x
                y0 = event.y

                invalidate()


                if(event.actionMasked == MotionEvent.ACTION_UP)
                    animation()

                return true
            }
        })
    }

    /*fun PointView(context: Context) {
        setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.e("clicked", "clicked")
            }
        })
    }*/


    fun init() {
        whitePaint.setARGB (255, 255, 255, 255)
        whitePaint.setStyle(Paint.Style.FILL)
        redPaint.setARGB(255,255,0,0)
        redPaint.setStyle(Paint.Style.FILL)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawCircle(x0, y0,50F, whitePaint)
        canvas.drawCircle(x0, y0, r, redPaint)

    }

    fun animation(){
        /*for(i in 1..1000) {
            Thread.sleep(1)
            r = 48F * (1000-i)/1000
            invalidate()
        }*/
    }

}