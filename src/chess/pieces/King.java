package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;

public class King extends ChessPiece {

	public King(Board board, chess.Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		String piece = this.getClass().getSimpleName();
		return piece.substring(0, 1);
	}

}
