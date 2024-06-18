package com.example.puffandpoof.adaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.example.puffandpoof.R;
import com.example.puffandpoof.model.Transaction;
import object.Transactionlist;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0013\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/puffandpoof/adaptor/TransactionAdap;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/puffandpoof/adaptor/TransactionAdap$TransactionViewHolder;", "transactionList", "", "Lcom/example/puffandpoof/model/Transaction;", "clickListener", "Lcom/example/puffandpoof/adaptor/TransactionAdap$TransactionClickListener;", "(Ljava/util/List;Lcom/example/puffandpoof/adaptor/TransactionAdap$TransactionClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TransactionClickListener", "TransactionViewHolder", "app_debug"})
public final class TransactionAdap extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.puffandpoof.adaptor.TransactionAdap.TransactionViewHolder> {
    private java.util.List<com.example.puffandpoof.model.Transaction> transactionList;
    private final com.example.puffandpoof.adaptor.TransactionAdap.TransactionClickListener clickListener = null;
    
    public TransactionAdap(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.puffandpoof.model.Transaction> transactionList, @org.jetbrains.annotations.NotNull()
    com.example.puffandpoof.adaptor.TransactionAdap.TransactionClickListener clickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.puffandpoof.adaptor.TransactionAdap.TransactionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.puffandpoof.adaptor.TransactionAdap.TransactionViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/example/puffandpoof/adaptor/TransactionAdap$TransactionClickListener;", "", "onTransactionDelete", "", "position", "", "onTransactionUpdate", "newQuantity", "app_debug"})
    public static abstract interface TransactionClickListener {
        
        public abstract void onTransactionUpdate(int position, int newQuantity);
        
        public abstract void onTransactionDelete(int position);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/puffandpoof/adaptor/TransactionAdap$TransactionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/puffandpoof/adaptor/TransactionAdap;Landroid/view/View;)V", "deleteButton", "Landroid/widget/Button;", "getDeleteButton", "()Landroid/widget/Button;", "dollName", "Landroid/widget/TextView;", "getDollName", "()Landroid/widget/TextView;", "editTextQuantity", "Landroid/widget/EditText;", "getEditTextQuantity", "()Landroid/widget/EditText;", "transactionDate", "getTransactionDate", "transactionQuantity", "getTransactionQuantity", "updateButton", "getUpdateButton", "app_debug"})
    public final class TransactionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView dollName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView transactionQuantity = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView transactionDate = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.Button updateButton = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.Button deleteButton = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.EditText editTextQuantity = null;
        
        public TransactionViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDollName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTransactionQuantity() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTransactionDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getUpdateButton() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getDeleteButton() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.EditText getEditTextQuantity() {
            return null;
        }
    }
}