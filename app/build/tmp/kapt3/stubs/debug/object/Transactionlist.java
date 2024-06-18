package object;

import com.example.puffandpoof.model.Transaction;
import java.util.concurrent.atomic.AtomicInteger;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\rJ\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lobject/Transactionlist;", "", "()V", "idCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "transactions", "", "Lcom/example/puffandpoof/model/Transaction;", "addTransaction", "", "dollName", "", "quantity", "", "dates", "getTransactions", "", "removeTransaction", "id", "updateQuantity", "app_debug"})
public final class Transactionlist {
    @org.jetbrains.annotations.NotNull()
    public static final object.Transactionlist INSTANCE = null;
    private static final java.util.List<com.example.puffandpoof.model.Transaction> transactions = null;
    private static final java.util.concurrent.atomic.AtomicInteger idCounter = null;
    
    private Transactionlist() {
        super();
    }
    
    public final void addTransaction(@org.jetbrains.annotations.NotNull()
    java.lang.String dollName, int quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String dates) {
    }
    
    public final void updateQuantity(int id, int quantity) {
    }
    
    public final void removeTransaction(int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.puffandpoof.model.Transaction> getTransactions() {
        return null;
    }
}