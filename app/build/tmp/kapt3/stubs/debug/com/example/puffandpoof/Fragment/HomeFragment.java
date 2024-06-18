package com.example.puffandpoof.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.puffandpoof.DetailDollActivity;
import com.example.puffandpoof.R;
import com.example.puffandpoof.adaptor.DollAdap;
import com.example.puffandpoof.AppDatabase;
import com.example.puffandpoof.DollDao;
import com.example.puffandpoof.model.Doll;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONObject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010!\u001a\u00020\r2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/puffandpoof/Fragment/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/puffandpoof/adaptor/DollAdap$OnItemClickListener;", "()V", "adap", "Lcom/example/puffandpoof/adaptor/DollAdap;", "dollDao", "Lcom/example/puffandpoof/DollDao;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "requestQueue", "Lcom/android/volley/RequestQueue;", "fetchDataFromJSON", "", "getDataFromDatabase", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "position", "", "onViewCreated", "view", "parseDollData", "", "Lcom/example/puffandpoof/model/Doll;", "jsonObject", "Lorg/json/JSONObject;", "storeDataInDatabase", "dolls", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.example.puffandpoof.adaptor.DollAdap.OnItemClickListener {
    private com.example.puffandpoof.adaptor.DollAdap adap;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.example.puffandpoof.DollDao dollDao;
    private com.android.volley.RequestQueue requestQueue;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void fetchDataFromJSON() {
    }
    
    private final java.util.List<com.example.puffandpoof.model.Doll> parseDollData(org.json.JSONObject jsonObject) {
        return null;
    }
    
    private final void storeDataInDatabase(java.util.List<com.example.puffandpoof.model.Doll> dolls) {
    }
    
    private final void getDataFromDatabase() {
    }
    
    @java.lang.Override()
    public void onItemClick(int position) {
    }
}