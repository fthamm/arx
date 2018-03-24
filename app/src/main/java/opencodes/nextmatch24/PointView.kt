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

    var mTextPaint: TextPaint = TextPaint()
    var x0: Float = Float.MAX_VALUE
    var y0: Float = Float.MAX_VALUE

    constructor(context: Context): super(context) {
        setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent): Boolean {
                Log.e("clicked", event.actionMasked.toString())
                x0 = event.x
                y0 = event.y

                invalidate()


                if(event.actionMasked == MotionEvent.ACTION_UP)
                    Log.e("€€€€€€€€€€","REALEASED")

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
        mTextPaint.setARGB (255, 255, 0, 0)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        init()
        canvas.drawCircle(x0, y0,50F, mTextPaint)

    }

    override fun onCreateContextMenu(menu: ContextMenu?) {
        super.onCreateContextMenu(menu)
    }

}