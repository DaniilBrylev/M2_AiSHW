package org.example;

import java.util.Comparator;

public class MyArrays {

    // Бинарный поиск для массива типа byte
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(Byte.valueOf(key), a);
    }

    private static int binarySearch(Byte key, byte[] a) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = Byte.compare(a[mid], key);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid; // ключ найден
            }
        }
        return -(low + 1); // ключ не найден
    }

    // Аналогичные методы для других примитивных типов
    public static int binarySearch(char[] a, char key) {
        return binarySearch(Character.valueOf(key), a);
    }

    private static int binarySearch(Character key, char[] a) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = Character.compare(a[mid], key);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid; // ключ найден
            }
        }
        return -(low + 1); // ключ не найден
    }

    // Здесь можно добавить другие методы аналогичным образом
    public static int binarySearch(int[] a, int key) {
        return binarySearch(Integer.valueOf(key), a);
    }

    private static int binarySearch(Integer key, int[] a) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = Integer.compare(a[mid], key);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid; // ключ найден
            }
        }
        return -(low + 1); // ключ не найден
    }

    // Обобщённый метод для объектов
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    private static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = c.compare(a[mid], key);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid; // ключ найден
            }
        }

        return -(low + 1); // ключ не найден
    }
}
