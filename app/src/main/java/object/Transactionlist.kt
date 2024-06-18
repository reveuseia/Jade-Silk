package `object`

import com.example.puffandpoof.model.Transaction
import java.util.concurrent.atomic.AtomicInteger

object Transactionlist {
    private val transactions: MutableList<Transaction> = mutableListOf()
    private val idCounter = AtomicInteger(0)

    fun addTransaction(dollName: String, quantity: Int, dates: String) {
        val id = idCounter.incrementAndGet()
        val transaction = Transaction(id, dollName, quantity, dates)
        transactions.add(transaction)
    }

    fun updateQuantity(id: Int, quantity: Int) {
        val transaction = transactions.find { it.idz == id }
        transaction?.quantity = quantity
    }

    fun removeTransaction(id: Int) {
        transactions.removeAll { it.idz == id }
    }

    fun getTransactions(): List<Transaction> {
        return transactions.toList()
    }
}


