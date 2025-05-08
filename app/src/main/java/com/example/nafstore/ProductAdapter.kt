package com.example.nafstore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup // ← Tambahkan baris ini
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ProductAdapter(
    private val context: Context,
    private val names: Array<String>,
    private val images: Array<Int>
) : BaseAdapter() {
    override fun getCount(): Int = names.size
    override fun getItem(position: Int): Any = names[position]
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.item_product, parent, false)
        val imageView = view.findViewById<ImageView>(R.id.productImage)
        val textView = view.findViewById<TextView>(R.id.productName)

        imageView.setImageResource(images[position])
        textView.text = names[position]

        return view
    }
}
