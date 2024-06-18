package com.example.puffandpoof;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.puffandpoof.model.Doll;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/puffandpoof/DollDao;", "", "deleteAllDolls", "", "getAllDolls", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/puffandpoof/model/Doll;", "insertDolls", "dolls", "app_debug"})
public abstract interface DollDao {
    
    @androidx.room.Insert()
    public abstract void insertDolls(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.puffandpoof.model.Doll> dolls);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM doll")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.puffandpoof.model.Doll>> getAllDolls();
    
    @androidx.room.Query(value = "DELETE FROM doll")
    public abstract void deleteAllDolls();
}