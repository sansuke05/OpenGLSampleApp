package com.alicelab.openglsampleapp

import android.content.Context
import android.opengl.GLSurfaceView

class MainGLView(context: Context) : GLSurfaceView(context) {
    private val mainRenderer: MainRenderer

    init {
        setEGLContextClientVersion(2)
        mainRenderer = MainRenderer()
        setRenderer(mainRenderer)
    }
}