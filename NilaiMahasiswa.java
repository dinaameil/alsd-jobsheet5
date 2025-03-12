public class NilaiMahasiswa {
    int uts[];
    int uas[];
    
    NilaiMahasiswa(int uts[], int uas[]) {
        this.uts = uts;
        this.uas = uas;
    }

    int maxUTS(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int leftMax = maxUTS(arr, l, mid);
        int rightMax = maxUTS(arr, mid + 1, r);
        return Math.max(leftMax, rightMax);
    }

    int minUTS(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int leftMin = minUTS(arr, l, mid);
        int rightMin = minUTS(arr, mid + 1, r);
        return Math.min(leftMin, rightMin);
    }

    double avgUAS(int arr[]) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total / arr.length;
    }
}
