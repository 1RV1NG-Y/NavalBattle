package com.example.proyecto

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Handler
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.Toast


class Select : View {
    private var select: Int = 100

    constructor(ctx: Context) : super(ctx) {
    }

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs) {
    }

    constructor(ctx: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        ctx,
        attrs,
        defStyleAttr
    ) {
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val ancho = calcularAncho(widthMeasureSpec)
        val alto = calcularAlto(heightMeasureSpec)
        setMeasuredDimension(ancho, alto)
    }

    private fun calcularAncho(limitesSpec: Int): Int {
        var res = 100
        val modo = MeasureSpec.getMode(limitesSpec)
        val limite = MeasureSpec.getSize(limitesSpec)
        if (modo == MeasureSpec.AT_MOST) {
            res = limite
        } else if (modo == MeasureSpec.EXACTLY) {
            res = limite
        }
        return res
    }

    private fun calcularAlto(limitesSpec: Int): Int {
        var res = 200
        val modo = MeasureSpec.getMode(limitesSpec)
        val limite = MeasureSpec.getSize(limitesSpec)
        if (modo == MeasureSpec.AT_MOST) {
            res = limite
        } else if (modo == MeasureSpec.EXACTLY) {
            res = limite
        }
        return res
    }


    override fun onDraw(canvas: Canvas) {
        val alto = measuredHeight
        val ancho = measuredWidth


        val pBorde = Paint()
        pBorde.style = Paint.Style.STROKE
        pBorde.color = Color.BLACK
        pBorde.setStrokeWidth(4f)
        //verticales
        for (i in 0..9) {
            canvas.drawRect(
                ancho / 10f * i.toFloat(),
                alto.toFloat() / 22f,
                ancho.toFloat(),
                alto.toFloat() / 22 * 11,
                pBorde
            )
            canvas.drawRect(
                0f,
                alto / 22f * i.toFloat(),
                ancho.toFloat(),
                alto.toFloat() / 22 * 10,
                pBorde
            )
        }
        pBorde.color = Color.RED
        pBorde.setStrokeWidth(4f)
        //verticales
        for (i in 0..9) {
            canvas.drawRect(
                ancho / 10f * i.toFloat(),
                alto.toFloat() / 22f * 12,
                ancho.toFloat(),
                alto.toFloat() / 22 * 22,
                pBorde
            )
            canvas.drawRect(
                0f,
                alto / 22f * 12 + alto / 22f * i.toFloat(),
                ancho.toFloat(),
                alto.toFloat() / 22f * 22,
                pBorde
            )
        }
        //datos de puntuacion
        val textPaint = Paint()
        textPaint.color = Color.MAGENTA
        textPaint.textSize = 50f
        //texto izquierda
        //canvas.drawText("Usuario: ", ancho/16f, alto.toFloat()/22f-25f, textPaint)
        //canvas.drawText("Usuario: ", ancho/16f, alto.toFloat()/22f*12-25f, textPaint)

        //texto derecha
        //canvas.drawText("Puntos: ", ancho/16f*8, alto.toFloat()/22f-25f, textPaint)
        //canvas.drawText("Puntos: ", ancho/16f*8, alto.toFloat()/22f*12-25f, textPaint)

        for (i in todo2) {
            var cordenadas = cords(i)
            val pRelleno = Paint()
            pRelleno.style = Paint.Style.FILL
            pRelleno.color = Color.BLUE
            canvas.drawRect(
                cordenadas[0] + 4f,
                cordenadas[1] + 4f,
                cordenadas[2] - 4f,
                cordenadas[3] - 4f,
                pRelleno
            )

        }
        for (i in down) {
            var cordenadas = cords(i)
            val pRelleno = Paint()
            pRelleno.style = Paint.Style.FILL
            pRelleno.color = Color.RED
            canvas.drawRect(
                cordenadas[0] + 4f,
                cordenadas[1] + 4f,
                cordenadas[2] - 4f,
                cordenadas[3] - 4f,
                pRelleno
            )
        }
        for (i in upp) {
            var cordenadas2 = cords2(i)
            val pRelleno = Paint()
            pRelleno.style = Paint.Style.FILL
            pRelleno.color = Color.RED
            canvas.drawRect(
                cordenadas2[0] + 4f,
                cordenadas2[1] + 4f,
                cordenadas2[2] - 4f,
                cordenadas2[3] - 4f,
                pRelleno
            )
        }

        canvas.drawText("Jugador - Hits al enemigo: $hits", ancho / 16f, alto.toFloat() / 22f - 25f, textPaint)
        Handler().postDelayed({ invalidate() }, 200)
        canvas.drawText("Bot - Hits al jugador: $hitsB", ancho / 16f, alto.toFloat() / 22f*12 - 25f, textPaint)
        Handler().postDelayed({ invalidate() }, 200)
    }

    private fun cords(pos: Int): ArrayList<Float> {
        var a = ArrayList<Float>()
        val alto = measuredHeight
        val ancho = measuredWidth
        when (pos) {
            1 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 12)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 13)
            }
            2 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 12)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 13)
            }
            3 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 12)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 13)
            }
            4 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 12)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 13)
            }
            5 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 12)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 13)
            }
            6 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 12)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 13)
            }
            7 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 12)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 13)
            }
            8 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 12)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 13)
            }
            9 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 12)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 13)
            }
            10 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 12)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 13)
            }
            11 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 13)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 14)
            }
            12 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 13)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 14)
            }
            13 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 13)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 14)
            }
            14 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 13)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 14)
            }
            15 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 13)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 14)
            }
            16 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 13)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 14)
            }
            17 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 13)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 14)
            }
            18 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 13)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 14)
            }
            19 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 13)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 14)
            }
            20 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 13)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 14)
            }
            21 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 14)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 15)
            }
            22 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 14)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 15)
            }
            23 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 14)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 15)
            }
            24 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 14)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 15)
            }
            25 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 14)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 15)
            }
            26 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 14)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 15)
            }
            27 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 14)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 15)
            }
            28 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 14)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 15)
            }
            29 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 14)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 15)
            }
            30 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 14)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 15)
            }
            31 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 15)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 16)
            }
            32 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 15)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 16)
            }
            33 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 15)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 16)
            }
            34 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 15)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 16)
            }
            35 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 15)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 16)
            }
            36 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 15)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 16)
            }
            37 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 15)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 16)
            }
            38 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 15)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 16)
            }
            39 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 15)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 16)
            }
            40 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 15)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 16)
            }
            41 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 16)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 17)
            }
            42 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 16)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 17)
            }
            43 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 16)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 17)
            }
            44 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 16)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 17)
            }
            45 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 16)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 17)
            }
            46 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 16)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 17)
            }
            47 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 16)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 17)
            }
            48 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 16)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 17)
            }
            49 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 16)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 17)
            }
            50 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 16)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 17)
            }
            51 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 17)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 18)
            }
            52 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 17)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 18)
            }
            53 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 17)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 18)
            }
            54 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 17)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 18)
            }
            55 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 17)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 18)
            }
            56 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 17)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 18)
            }
            57 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 17)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 18)
            }
            58 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 17)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 18)
            }
            59 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 17)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 18)
            }
            60 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 17)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 18)
            }
            61 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 18)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 19)
            }
            62 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 18)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 19)
            }
            63 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 18)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 19)
            }
            64 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 18)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 19)
            }
            65 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 18)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 19)
            }
            66 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 18)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 19)
            }
            67 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 18)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 19)
            }
            68 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 18)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 19)
            }
            69 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 18)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 19)
            }
            70 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 18)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 19)
            }
            71 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 19)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 20)
            }
            72 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 19)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 20)
            }
            73 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 19)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 20)
            }
            74 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 19)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 20)
            }
            75 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 19)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 20)
            }
            76 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 19)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 20)
            }
            77 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 19)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 20)
            }
            78 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 19)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 20)
            }
            79 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 19)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 20)
            }
            80 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 19)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 20)
            }
            81 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 20)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 21)
            }
            82 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 20)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 21)
            }
            83 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 20)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 21)
            }
            84 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 20)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 21)
            }
            85 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 20)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 21)
            }
            86 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 20)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 21)
            }
            87 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 20)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 21)
            }
            88 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 20)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 21)
            }
            89 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 20)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 21)
            }
            90 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 20)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 21)
            }
            91 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 21)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 22)
            }
            92 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 21)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 22)
            }
            93 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 21)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 22)
            }
            94 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 21)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 22)
            }
            95 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 21)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 22)
            }
            96 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 21)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 22)
            }
            97 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 21)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 22)
            }
            98 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 21)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 22)
            }
            99 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 21)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 22)
            }
            100 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 21)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 22)
            }
            else -> {

            }
        }
        return a
    }

    private fun cords2(pos: Int): ArrayList<Float> {
        var a = ArrayList<Float>()
        val alto = measuredHeight
        val ancho = measuredWidth
        when (pos) {
            1 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 1)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 2)
            }
            2 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 1)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 2)
            }
            3 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 1)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 2)
            }
            4 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 1)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 2)
            }
            5 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 1)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 2)
            }
            6 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 1)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 2)
            }
            7 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 1)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 2)
            }
            8 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 1)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 2)
            }
            9 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 1)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 2)
            }
            10 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 1)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 2)
            }
            11 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 2)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 3)
            }
            12 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 2)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 3)
            }
            13 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 2)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 3)
            }
            14 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 2)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 3)
            }
            15 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 2)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 3)
            }
            16 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 2)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 3)
            }
            17 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 2)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 3)
            }
            18 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 2)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 3)
            }
            19 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 2)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 3)
            }
            20 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 2)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 3)
            }
            21 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 3)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 4)
            }
            22 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 3)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 4)
            }
            23 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 3)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 4)
            }
            24 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 3)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 4)
            }
            25 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 3)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 4)
            }
            26 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 3)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 4)
            }
            27 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 3)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 4)
            }
            28 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 3)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 4)
            }
            29 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 3)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 4)
            }
            30 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 3)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 4)
            }
            31 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 4)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 5)
            }
            32 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 4)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 5)
            }
            33 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 4)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 5)
            }
            34 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 4)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 5)
            }
            35 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 4)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 5)
            }
            36 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 4)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 5)
            }
            37 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 4)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 5)
            }
            38 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 4)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 5)
            }
            39 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 4)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 5)
            }
            40 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 4)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 5)
            }
            41 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 5)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 6)
            }
            42 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 5)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 6)
            }
            43 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 5)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 6)
            }
            44 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 5)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 6)
            }
            45 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 5)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 6)
            }
            46 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 5)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 6)
            }
            47 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 5)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 6)
            }
            48 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 5)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 6)
            }
            49 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 5)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 6)
            }
            50 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 5)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 6)
            }
            51 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 6)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 7)
            }
            52 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 6)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 7)
            }
            53 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 6)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 7)
            }
            54 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 6)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 7)
            }
            55 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 6)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 7)
            }
            56 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 6)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 7)
            }
            57 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 6)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 7)
            }
            58 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 6)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 7)
            }
            59 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 6)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 7)
            }
            60 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 6)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 7)
            }
            61 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 7)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 8)
            }
            62 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 7)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 8)
            }
            63 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 7)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 8)
            }
            64 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 7)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 8)
            }
            65 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 7)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 8)
            }
            66 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 7)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 8)
            }
            67 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 7)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 8)
            }
            68 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 7)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 8)
            }
            69 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 7)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 8)
            }
            70 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 7)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 8)
            }
            71 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 8)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 9)
            }
            72 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 8)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 9)
            }
            73 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 8)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 9)
            }
            74 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 8)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 9)
            }
            75 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 8)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 9)
            }
            76 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 8)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 9)
            }
            77 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 8)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 9)
            }
            78 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 8)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 9)
            }
            79 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 8)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 9)
            }
            80 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 8)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 9)
            }
            81 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 9)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 10)
            }
            82 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 9)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 10)
            }
            83 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 9)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 10)
            }
            84 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 9)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 10)
            }
            85 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 9)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 10)
            }
            86 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 9)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 10)
            }
            87 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 9)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 10)
            }
            88 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 9)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 10)
            }
            89 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 9)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 10)
            }
            90 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 9)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 10)
            }
            91 -> {
                a.add(0, 0f)
                a.add(1, alto / 22f * 10)
                a.add(2, ancho / 10f)
                a.add(3, alto / 22f * 11)
            }
            92 -> {
                a.add(0, ancho / 10f)
                a.add(1, alto / 22f * 10)
                a.add(2, ancho / 10f * 2)
                a.add(3, alto / 22f * 11)
            }
            93 -> {
                a.add(0, ancho / 10f * 2)
                a.add(1, alto / 22f * 10)
                a.add(2, ancho / 10f * 3)
                a.add(3, alto / 22f * 11)
            }
            94 -> {
                a.add(0, ancho / 10f * 3)
                a.add(1, alto / 22f * 10)
                a.add(2, ancho / 10f * 4)
                a.add(3, alto / 22f * 11)
            }
            95 -> {
                a.add(0, ancho / 10f * 4)
                a.add(1, alto / 22f * 10)
                a.add(2, ancho / 10f * 5)
                a.add(3, alto / 22f * 11)
            }
            96 -> {
                a.add(0, ancho / 10f * 5)
                a.add(1, alto / 22f * 10)
                a.add(2, ancho / 10f * 6)
                a.add(3, alto / 22f * 11)
            }
            97 -> {
                a.add(0, ancho / 10f * 6)
                a.add(1, alto / 22f * 10)
                a.add(2, ancho / 10f * 7)
                a.add(3, alto / 22f * 11)
            }
            98 -> {
                a.add(0, ancho / 10f * 7)
                a.add(1, alto / 22f * 10)
                a.add(2, ancho / 10f * 8)
                a.add(3, alto / 22f * 11)
            }
            99 -> {
                a.add(0, ancho / 10f * 8)
                a.add(1, alto / 22f * 10)
                a.add(2, ancho / 10f * 9)
                a.add(3, alto / 22f * 11)
            }
            100 -> {
                a.add(0, ancho / 10f * 9)
                a.add(1, alto / 22f * 10)
                a.add(2, ancho / 10f * 10)
                a.add(3, alto / 22f * 11)
            }
            else -> {

            }
        }
        return a
    }

    private var listener: OnSelectedListener? = null

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val cord = selecciona(event)
        if (cord != 0) {
            listener?.onSelected(cord)
        }
        this.invalidate()
        return super.onTouchEvent(event)
    }

    fun setOnSelectedListener(change: (Int) -> Unit) {
        listener = object : OnSelectedListener {
            override fun onSelected(select: Int) {
                change(select)
            }
        }
    }

    fun selecciona(event: MotionEvent): Int {
        var posicion = 0
        val alto = measuredHeight
        val ancho = measuredWidth
        if (event.y > alto / 22 && event.y < alto / 22 * 2) {
            if (event.x > 0 && event.x < ancho / 10) {
                return 1
            } else if (event.x > ancho / 10 && event.x < ancho / 10 * 2) {
                return 2
            } else if (event.x > ancho / 10 * 2 && event.x < ancho / 10 * 3) {
                return 3
            } else if (event.x > ancho / 10 * 3 && event.x < ancho / 10 * 4) {
                return 4
            } else if (event.x > ancho / 10 * 4 && event.x < ancho / 10 * 5) {
                return 5
            } else if (event.x > ancho / 10 * 5 && event.x < ancho / 10 * 6) {
                return 6
            } else if (event.x > ancho / 10 * 6 && event.x < ancho / 10 * 7) {
                return 7
            } else if (event.x > ancho / 10 * 7 && event.x < ancho / 10 * 8) {
                return 8
            } else if (event.x > ancho / 10 * 8 && event.x < ancho / 10 * 9) {
                return 9
            } else if (event.x > ancho / 10 * 9 && event.x < ancho / 10 * 10) {
                return 10
            }
        } else if (event.y > alto / 22 * 2 && event.y < alto / 22 * 3) {
            if (event.x > 0 && event.x < ancho / 10) {
                return 11
            } else if (event.x > ancho / 10 && event.x < ancho / 10 * 2) {
                return 12
            } else if (event.x > ancho / 10 * 2 && event.x < ancho / 10 * 3) {
                return 13
            } else if (event.x > ancho / 10 * 3 && event.x < ancho / 10 * 4) {
                return 14
            } else if (event.x > ancho / 10 * 4 && event.x < ancho / 10 * 5) {
                return 15
            } else if (event.x > ancho / 10 * 5 && event.x < ancho / 10 * 6) {
                return 16
            } else if (event.x > ancho / 10 * 6 && event.x < ancho / 10 * 7) {
                return 17
            } else if (event.x > ancho / 10 * 7 && event.x < ancho / 10 * 8) {
                return 18
            } else if (event.x > ancho / 10 * 8 && event.x < ancho / 10 * 9) {
                return 19
            } else if (event.x > ancho / 10 * 9 && event.x < ancho / 10 * 10) {
                return 20
            }
        } else if (event.y > alto / 22 * 3 && event.y < alto / 22 * 4) {
            if (event.x > 0 && event.x < ancho / 10) {
                return 21
            } else if (event.x > ancho / 10 && event.x < ancho / 10 * 2) {
                return 22
            } else if (event.x > ancho / 10 * 2 && event.x < ancho / 10 * 3) {
                return 23
            } else if (event.x > ancho / 10 * 3 && event.x < ancho / 10 * 4) {
                return 24
            } else if (event.x > ancho / 10 * 4 && event.x < ancho / 10 * 5) {
                return 25
            } else if (event.x > ancho / 10 * 5 && event.x < ancho / 10 * 6) {
                return 26
            } else if (event.x > ancho / 10 * 6 && event.x < ancho / 10 * 7) {
                return 27
            } else if (event.x > ancho / 10 * 7 && event.x < ancho / 10 * 8) {
                return 28
            } else if (event.x > ancho / 10 * 8 && event.x < ancho / 10 * 9) {
                return 29
            } else if (event.x > ancho / 10 * 9 && event.x < ancho / 10 * 10) {
                return 30
            }
        } else if (event.y > alto / 22 * 4 && event.y < alto / 22 * 5) {
            if (event.x > 0 && event.x < ancho / 10) {
                return 31
            } else if (event.x > ancho / 10 && event.x < ancho / 10 * 2) {
                return 32
            } else if (event.x > ancho / 10 * 2 && event.x < ancho / 10 * 3) {
                return 33
            } else if (event.x > ancho / 10 * 3 && event.x < ancho / 10 * 4) {
                return 34
            } else if (event.x > ancho / 10 * 4 && event.x < ancho / 10 * 5) {
                return 35
            } else if (event.x > ancho / 10 * 5 && event.x < ancho / 10 * 6) {
                return 36
            } else if (event.x > ancho / 10 * 6 && event.x < ancho / 10 * 7) {
                return 37
            } else if (event.x > ancho / 10 * 7 && event.x < ancho / 10 * 8) {
                return 38
            } else if (event.x > ancho / 10 * 8 && event.x < ancho / 10 * 9) {
                return 39
            } else if (event.x > ancho / 10 * 9 && event.x < ancho / 10 * 10) {
                return 40
            }
        } else if (event.y > alto / 22 * 5 && event.y < alto / 22 * 6) {
            if (event.x > 0 && event.x < ancho / 10) {
                return 41
            } else if (event.x > ancho / 10 && event.x < ancho / 10 * 2) {
                return 42
            } else if (event.x > ancho / 10 * 2 && event.x < ancho / 10 * 3) {
                return 43
            } else if (event.x > ancho / 10 * 3 && event.x < ancho / 10 * 4) {
                return 44
            } else if (event.x > ancho / 10 * 4 && event.x < ancho / 10 * 5) {
                return 45
            } else if (event.x > ancho / 10 * 5 && event.x < ancho / 10 * 6) {
                return 46
            } else if (event.x > ancho / 10 * 6 && event.x < ancho / 10 * 7) {
                return 47
            } else if (event.x > ancho / 10 * 7 && event.x < ancho / 10 * 8) {
                return 48
            } else if (event.x > ancho / 10 * 8 && event.x < ancho / 10 * 9) {
                return 49
            } else if (event.x > ancho / 10 * 9 && event.x < ancho / 10 * 10) {
                return 50
            }
        } else if (event.y > alto / 22 * 6 && event.y < alto / 22 * 7) {
            if (event.x > 0 && event.x < ancho / 10) {
                return 51
            } else if (event.x > ancho / 10 && event.x < ancho / 10 * 2) {
                return 52
            } else if (event.x > ancho / 10 * 2 && event.x < ancho / 10 * 3) {
                return 53
            } else if (event.x > ancho / 10 * 3 && event.x < ancho / 10 * 4) {
                return 54
            } else if (event.x > ancho / 10 * 4 && event.x < ancho / 10 * 5) {
                return 55
            } else if (event.x > ancho / 10 * 5 && event.x < ancho / 10 * 6) {
                return 56
            } else if (event.x > ancho / 10 * 6 && event.x < ancho / 10 * 7) {
                return 57
            } else if (event.x > ancho / 10 * 7 && event.x < ancho / 10 * 8) {
                return 58
            } else if (event.x > ancho / 10 * 8 && event.x < ancho / 10 * 9) {
                return 59
            } else if (event.x > ancho / 10 * 9 && event.x < ancho / 10 * 10) {
                return 60
            }
        } else if (event.y > alto / 22 * 7 && event.y < alto / 22 * 8) {
            if (event.x > 0 && event.x < ancho / 10) {
                return 61
            } else if (event.x > ancho / 10 && event.x < ancho / 10 * 2) {
                return 62
            } else if (event.x > ancho / 10 * 2 && event.x < ancho / 10 * 3) {
                return 63
            } else if (event.x > ancho / 10 * 3 && event.x < ancho / 10 * 4) {
                return 64
            } else if (event.x > ancho / 10 * 4 && event.x < ancho / 10 * 5) {
                return 65
            } else if (event.x > ancho / 10 * 5 && event.x < ancho / 10 * 6) {
                return 66
            } else if (event.x > ancho / 10 * 6 && event.x < ancho / 10 * 7) {
                return 67
            } else if (event.x > ancho / 10 * 7 && event.x < ancho / 10 * 8) {
                return 68
            } else if (event.x > ancho / 10 * 8 && event.x < ancho / 10 * 9) {
                return 69
            } else if (event.x > ancho / 10 * 9 && event.x < ancho / 10 * 10) {
                return 70
            }
        } else if (event.y > alto / 22 * 8 && event.y < alto / 22 * 9) {
            if (event.x > 0 && event.x < ancho / 10) {
                return 71
            } else if (event.x > ancho / 10 && event.x < ancho / 10 * 2) {
                return 72
            } else if (event.x > ancho / 10 * 2 && event.x < ancho / 10 * 3) {
                return 73
            } else if (event.x > ancho / 10 * 3 && event.x < ancho / 10 * 4) {
                return 74
            } else if (event.x > ancho / 10 * 4 && event.x < ancho / 10 * 5) {
                return 75
            } else if (event.x > ancho / 10 * 5 && event.x < ancho / 10 * 6) {
                return 76
            } else if (event.x > ancho / 10 * 6 && event.x < ancho / 10 * 7) {
                return 77
            } else if (event.x > ancho / 10 * 7 && event.x < ancho / 10 * 8) {
                return 78
            } else if (event.x > ancho / 10 * 8 && event.x < ancho / 10 * 9) {
                return 79
            } else if (event.x > ancho / 10 * 9 && event.x < ancho / 10 * 10) {
                return 80
            }
        } else if (event.y > alto / 22 * 9 && event.y < alto / 22 * 10) {
            if (event.x > 0 && event.x < ancho / 10) {
                return 81
            } else if (event.x > ancho / 10 && event.x < ancho / 10 * 2) {
                return 82
            } else if (event.x > ancho / 10 * 2 && event.x < ancho / 10 * 3) {
                return 83
            } else if (event.x > ancho / 10 * 3 && event.x < ancho / 10 * 4) {
                return 84
            } else if (event.x > ancho / 10 * 4 && event.x < ancho / 10 * 5) {
                return 85
            } else if (event.x > ancho / 10 * 5 && event.x < ancho / 10 * 6) {
                return 86
            } else if (event.x > ancho / 10 * 6 && event.x < ancho / 10 * 7) {
                return 87
            } else if (event.x > ancho / 10 * 7 && event.x < ancho / 10 * 8) {
                return 88
            } else if (event.x > ancho / 10 * 8 && event.x < ancho / 10 * 9) {
                return 89
            } else if (event.x > ancho / 10 * 9 && event.x < ancho / 10 * 10) {
                return 90
            }
        } else if (event.y > alto / 22 * 10 && event.y < alto / 22 * 11) {
            if (event.x > 0 && event.x < ancho / 10) {
                return 91
            } else if (event.x > ancho / 10 && event.x < ancho / 10 * 2) {
                return 92
            } else if (event.x > ancho / 10 * 2 && event.x < ancho / 10 * 3) {
                return 93
            } else if (event.x > ancho / 10 * 3 && event.x < ancho / 10 * 4) {
                return 94
            } else if (event.x > ancho / 10 * 4 && event.x < ancho / 10 * 5) {
                return 95
            } else if (event.x > ancho / 10 * 5 && event.x < ancho / 10 * 6) {
                return 96
            } else if (event.x > ancho / 10 * 6 && event.x < ancho / 10 * 7) {
                return 97
            } else if (event.x > ancho / 10 * 7 && event.x < ancho / 10 * 8) {
                return 98
            } else if (event.x > ancho / 10 * 8 && event.x < ancho / 10 * 9) {
                return 99
            } else if (event.x > ancho / 10 * 9 && event.x < ancho / 10 * 10) {
                return 100
            }
        }
        return posicion
    }
}