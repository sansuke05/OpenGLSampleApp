package com.alicelab.openglsampleapp

import android.content.Context
import android.opengl.GLSurfaceView
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainFragment : Fragment() {
    interface GraphicRenderFragmentListener {
    }

    private var listener: GraphicRenderFragmentListener? = null
    private lateinit var glView: GLSurfaceView
    private lateinit var viewContext: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? GraphicRenderFragmentListener
        if (listener == null) {
            throw ClassCastException("$context must implement GraphicRenderFragmentListener")
        }
        viewContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        glView = MainGLView(viewContext)
        // Inflate the layout for this fragment
        return glView
    }

    override fun onResume() {
        super.onResume()
        glView.onResume()
    }

    override fun onPause() {
        super.onPause()
        glView.onPause()
    }
}