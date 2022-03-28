package com.yellowcode.roomsample.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\u0017\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J\u001b\u0010\u001d\u001a\u00020\u00162\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000\u00a2\u0006\u0002\b\u001eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/yellowcode/roomsample/adapters/NoteListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/yellowcode/roomsample/adapters/NoteListAdapter$NoteViewHolder;", "context", "Landroid/content/Context;", "noteDB", "Lcom/yellowcode/roomsample/database/NoteRoomDatabase;", "(Landroid/content/Context;Lcom/yellowcode/roomsample/database/NoteRoomDatabase;)V", "inflater", "Landroid/view/LayoutInflater;", "job", "Lkotlinx/coroutines/CompletableJob;", "getNoteDB", "()Lcom/yellowcode/roomsample/database/NoteRoomDatabase;", "notes", "", "Lcom/yellowcode/roomsample/model/Note;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNotes", "setNotes$app_debug", "NoteViewHolder", "app_debug"})
public final class NoteListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.yellowcode.roomsample.adapters.NoteListAdapter.NoteViewHolder> {
    private final android.view.LayoutInflater inflater = null;
    private java.util.List<com.yellowcode.roomsample.model.Note> notes;
    private final kotlinx.coroutines.CompletableJob job = null;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    @org.jetbrains.annotations.NotNull()
    private final com.yellowcode.roomsample.database.NoteRoomDatabase noteDB = null;
    
    public final void setNotes$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yellowcode.roomsample.model.Note> notes) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.yellowcode.roomsample.adapters.NoteListAdapter.NoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.yellowcode.roomsample.adapters.NoteListAdapter.NoteViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yellowcode.roomsample.database.NoteRoomDatabase getNoteDB() {
        return null;
    }
    
    public NoteListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.yellowcode.roomsample.database.NoteRoomDatabase noteDB) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/yellowcode/roomsample/adapters/NoteListAdapter$NoteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/yellowcode/roomsample/adapters/NoteListAdapter;Landroid/view/View;)V", "addressItemView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getAddressItemView", "()Landroid/widget/TextView;", "contactItemView", "getContactItemView", "deleteItemView", "Landroid/widget/Button;", "getDeleteItemView", "()Landroid/widget/Button;", "emailItemView", "getEmailItemView", "titleItemView", "getTitleItemView", "app_debug"})
    public final class NoteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView titleItemView = null;
        private final android.widget.TextView emailItemView = null;
        private final android.widget.TextView addressItemView = null;
        private final android.widget.TextView contactItemView = null;
        private final android.widget.Button deleteItemView = null;
        
        public final android.widget.TextView getTitleItemView() {
            return null;
        }
        
        public final android.widget.TextView getEmailItemView() {
            return null;
        }
        
        public final android.widget.TextView getAddressItemView() {
            return null;
        }
        
        public final android.widget.TextView getContactItemView() {
            return null;
        }
        
        public final android.widget.Button getDeleteItemView() {
            return null;
        }
        
        public NoteViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}