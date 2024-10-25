public class Question12 {
    public static void main(String[] args) {
        int[] bishopPosition = {3, 5};
        int[] immovablePiecePosition = {5, 7};

        Result result = canReachBishop(bishopPosition, immovablePiecePosition);
        System.out.println(result.isReachable ? "YES" : "NO");
        if (result.isReachable) {
            System.out.println("Minimum steps: " + result.steps);
        }
    }

    public static Result canReachBishop(int[] bishop, int[] piece) {
        int bishopRow = bishop[0];
        int bishopCol = bishop[1];
        int pieceRow = piece[0];
        int pieceCol = piece[1];

        if ((bishopRow + bishopCol) % 2 != (pieceRow + pieceCol) % 2) {
            return new Result(false, 0);
        }

        if (bishopRow == pieceRow && bishopCol == pieceCol) {
            return new Result(true, 0);
        }

        if (Math.abs(bishopRow - pieceRow) == Math.abs(bishopCol - pieceCol)) {
            return new Result(true, 1);
        }

        return new Result(true, 2);
    }

    static class Result {
        boolean isReachable;
        int steps;

        Result(boolean isReachable, int steps) {
            this.isReachable = isReachable;
            this.steps = steps;
        }
    }
}
