package com.example.puffandpoof.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.puffandpoof.R
import com.example.puffandpoof.model.Transaction
import `object`.Transactionlist

class TransactionAdap(
    private var transactionList: MutableList<Transaction>,
    private val clickListener: TransactionClickListener
) : RecyclerView.Adapter<TransactionAdap.TransactionViewHolder>() {

    interface TransactionClickListener {
        fun onTransactionUpdate(position: Int, newQuantity: Int)
        fun onTransactionDelete(position: Int)
    }

    inner class TransactionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val transactionId: TextView = itemView.findViewById(R.id.dollID)
        val dollName: TextView = itemView.findViewById(R.id.ttldol)
        val transactionQuantity: TextView = itemView.findViewById(R.id.quantity)
        val transactionDate: TextView = itemView.findViewById(R.id.date)
        val updateButton: Button = itemView.findViewById(R.id.buttonUpdate)
        val deleteButton: Button = itemView.findViewById(R.id.buttonDelete)
        val editTextQuantity: EditText = itemView.findViewById(R.id.editTextQuantity)

        init {
            updateButton.setOnClickListener {
                val newQuantity = editTextQuantity.text.toString().toIntOrNull()
                if (newQuantity != null) {
                    clickListener.onTransactionUpdate(adapterPosition, newQuantity)
                } else {
                    Toast.makeText(itemView.context, "Invalid quantity", Toast.LENGTH_SHORT).show()
                }
            }

            deleteButton.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val currentItem = transactionList[position]
                    Transactionlist.removeTransaction(currentItem.idz)
                    transactionList.removeAt(position)
                    notifyItemRemoved(position)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.doll_list_transaction, parent, false)
        return TransactionViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val currentItem = transactionList[position]

//        holder.transactionId.text = currentItem.idz.toString()
        holder.dollName.text = currentItem.dollName
        holder.transactionQuantity.text = currentItem.quantity.toString()
        holder.transactionDate.text = currentItem.dates
    }

    override fun getItemCount() = transactionList.size
}






