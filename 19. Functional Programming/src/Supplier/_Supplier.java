package Supplier;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectioUrlSupplier.get());
        System.out.println(getDBConnectionUrlsSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectioUrlSupplier = () ->
            "jdbc://localhost:3333/admins";

    static Supplier<List<String>> getDBConnectionUrlsSupplier = ()
            -> Arrays.asList(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/customer");
}
