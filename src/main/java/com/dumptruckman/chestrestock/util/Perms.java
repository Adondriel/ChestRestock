package com.dumptruckman.chestrestock.util;

import com.dumptruckman.minecraft.pluginbase.permission.Perm;

public class Perms {
    
    public static final Perm CMD_CREATE = new Perm.Builder("cmd.create").build();
    public static final Perm CMD_CHECK = new Perm.Builder("cmd.check").build();
    public static final Perm CMD_UPDATE = new Perm.Builder("cmd.update").build();
    public static final Perm CMD_SET = new Perm.Builder("cmd.set").build();
    public static final Perm CMD_RESTOCK = new Perm.Builder("cmd.restock").build();
}