package com.example.puffandpoof;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.puffandpoof.model.Doll;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DollDao_Impl implements DollDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Doll> __insertionAdapterOfDoll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllDolls;

  public DollDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDoll = new EntityInsertionAdapter<Doll>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `doll` (`id`,`desc`,`name`,`size`,`price`,`brand`,`imageLink`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Doll value) {
        stmt.bindLong(1, value.getId());
        if (value.getDesc() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDesc());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getSize() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSize());
        }
        if (value.getPrice() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPrice());
        }
        if (value.getBrand() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBrand());
        }
        if (value.getImageLink() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getImageLink());
        }
      }
    };
    this.__preparedStmtOfDeleteAllDolls = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM doll";
        return _query;
      }
    };
  }

  @Override
  public void insertDolls(final List<Doll> dolls) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDoll.insert(dolls);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllDolls() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllDolls.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllDolls.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Doll>> getAllDolls() {
    final String _sql = "SELECT * FROM doll";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"doll"}, false, new Callable<List<Doll>>() {
      @Override
      public List<Doll> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfImageLink = CursorUtil.getColumnIndexOrThrow(_cursor, "imageLink");
          final List<Doll> _result = new ArrayList<Doll>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Doll _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDesc;
            if (_cursor.isNull(_cursorIndexOfDesc)) {
              _tmpDesc = null;
            } else {
              _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpSize;
            if (_cursor.isNull(_cursorIndexOfSize)) {
              _tmpSize = null;
            } else {
              _tmpSize = _cursor.getString(_cursorIndexOfSize);
            }
            final String _tmpPrice;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmpPrice = null;
            } else {
              _tmpPrice = _cursor.getString(_cursorIndexOfPrice);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final String _tmpImageLink;
            if (_cursor.isNull(_cursorIndexOfImageLink)) {
              _tmpImageLink = null;
            } else {
              _tmpImageLink = _cursor.getString(_cursorIndexOfImageLink);
            }
            _item = new Doll(_tmpId,_tmpDesc,_tmpName,_tmpSize,_tmpPrice,_tmpBrand,_tmpImageLink);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
