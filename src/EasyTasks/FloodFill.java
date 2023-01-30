package EasyTasks;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, color = 2;
        floodFill(image, sr, sc, color);
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));

        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor != color) {
            dfs(image, sr, sc, originalColor, color);
        }
        return image;
    }

    public static void dfs(int[][] image, int r, int c, int originalColor, int color) {
        if (image[r][c] == originalColor) {
            image[r][c] = color;
            if (r >= 1) {
                dfs(image, r - 1, c, originalColor, color);
            }
            if (c >= 1) {
                dfs(image, r, c - 1, originalColor, color);
            }
            if (r + 1 < image.length) {
                dfs(image, r + 1, c, originalColor, color);
            }
            if (c + 1 < image[0].length) {
                dfs(image, r, c + 1, originalColor, color);
            }
        }
    }
}
