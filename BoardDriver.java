public class BoardDriver {
    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        chess[0][0] = "r";
        chess[0][1] = "n";
        chess[0][2] = "b";
        chess[0][3] = "q";
        chess[0][4] = "k";
        chess[0][5] = "b";
        chess[0][6] = "n";
        chess[0][7] = "r";
        chess[7][0] = "r";
        chess[7][1] = "n";
        chess[7][2] = "b";
        chess[7][3] = "q";
        chess[7][4] = "k";
        chess[7][5] = "b";
        chess[7][6] = "n";
        chess[7][7] = "r";
        for (int row = 1; row < chess.length; row++) {
            for (int column = 0; column < chess[row].length; column++) {
                chess[1][column] = "p";
            }
        }
        for (int row = 6; row < chess.length; row++) {
            for (int column = 0; column < chess[row].length; column++) {
                chess[6][column] ="p";
            }
        }
        Board chessBoard = new Board(chess);
        System.out.println(chessBoard);
        System.out.println(chessBoard.numBlankSpaces());
        System.out.println(chessBoard.getPieceAt(7, 7));
        System.out.println(chessBoard.isSurrounded(chessBoard.getPieceAt(7, 7)));
        System.out.println(chessBoard.gameOver());
    }
}