package boardgame;

public class Board {

		private int row;
		private int column;
		private Piece[][] pieces;
		
		public int getRow() {
			return row;
		}

		public void setRow(int row) {
			this.row = row;
		}

		public int getColumn() {
			return column;
		}

		public void setColumn(int column) {
			this.column = column;
		}

		public Board(int row, int column) {
			this.row = row;
			this.column = column;
			pieces = new Piece[row][column];
		}
		
		
		
}
