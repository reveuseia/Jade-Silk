package com.example.puffandpoof.adaptor;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.puffandpoof.databinding.DollListBinding;
import com.example.puffandpoof.model.Doll;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0016\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u000bH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0014\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/puffandpoof/adaptor/DollAdap;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/puffandpoof/adaptor/DollAdap$DollViewHolder;", "dolls", "", "Lcom/example/puffandpoof/model/Doll;", "listener", "Lcom/example/puffandpoof/adaptor/DollAdap$OnItemClickListener;", "(Ljava/util/List;Lcom/example/puffandpoof/adaptor/DollAdap$OnItemClickListener;)V", "getItemAtPosition", "position", "", "getItemCount", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "newDolls", "DollViewHolder", "OnItemClickListener", "app_debug"})
public final class DollAdap extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.puffandpoof.adaptor.DollAdap.DollViewHolder> {
    private java.util.List<com.example.puffandpoof.model.Doll> dolls;
    private final com.example.puffandpoof.adaptor.DollAdap.OnItemClickListener listener = null;
    
    public DollAdap(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.puffandpoof.model.Doll> dolls, @org.jetbrains.annotations.NotNull()
    com.example.puffandpoof.adaptor.DollAdap.OnItemClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.puffandpoof.adaptor.DollAdap.DollViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.puffandpoof.adaptor.DollAdap.DollViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.puffandpoof.model.Doll> newDolls) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.puffandpoof.model.Doll getItemAtPosition(int position) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/puffandpoof/adaptor/DollAdap$OnItemClickListener;", "", "onItemClick", "", "position", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(int position);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/puffandpoof/adaptor/DollAdap$DollViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/puffandpoof/databinding/DollListBinding;", "(Lcom/example/puffandpoof/adaptor/DollAdap;Lcom/example/puffandpoof/databinding/DollListBinding;)V", "bind", "", "doll", "Lcom/example/puffandpoof/model/Doll;", "app_debug"})
    public final class DollViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.puffandpoof.databinding.DollListBinding binding = null;
        
        public DollViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.puffandpoof.databinding.DollListBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.puffandpoof.model.Doll doll) {
        }
    }
}