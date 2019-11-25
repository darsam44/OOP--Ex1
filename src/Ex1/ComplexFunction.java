package Ex1;

public class ComplexFunction implements complex_function {

	function left;
	function right;
	Operation OP;

	public ComplexFunction (String op, function left , function right) {

		if ( left != null ) {
			this.left = left;
		}
		if ( right != null ) {
			this.right = right;
		}

		switch(op.toLowerCase()) {
		case "Plus" :OP = Operation.Plus;
		break;
		case "Times" :OP = Operation.Times;
		break;
		case "Divid" :OP = Operation.Divid;
		break;
		case "Max" :OP = Operation.Max;
		break;
		case "Min" :OP = Operation.Min;
		break;
		case "Comp" :OP = Operation.Comp;
		break;
		case "None" :OP = Operation.None;
		break;
		default: OP = Operation.Error;
		break;

		}
	}
	public ComplexFunction (function left) {
		this.left = left;
		this.OP = Operation.None;
	}


	@Override
	public double f(double x) {

		switch(OP.toString().toLowerCase()) {

		case "plux" : return this.left.f(x) + this.right.f(x);
		
		case "mul" : return this.left.f(x) * this.right.f(x);
		
		case "div" : return this.left.f(x) / this.right.f(x);
		
		case "max" : 
			if (this.left.f(x) > this.right.f(x)) return this.left.f(x);
		else return this.right.f(x);
		
		case "min" : 
			if (this.left.f(x) < this.right.f(x)) return this.left.f(x);
		else return this.right.f(x);
		
		case "comp" : 
			if (this.right != null ) {
				return this.left.f(this.right.f(x));
			}
			else {
				// need to check
				return this.left.f(x);
			}
 		}


		return 0;
	}

	// need to finish
	@Override
	public function initFromString(String s) {
		if ( s.indexOf("(") == -1 || s.indexOf(")") == -1  ) {
			Polynom poly = new Polynom (s);
		}
		int opener = s.indexOf("(");
		int speride = s.lastIndexOf(',');
		
		
		return null;
	}

	@Override
	public function copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void plus(function f1) {
		if ( this.right != null ) {
			function f = new ComplexFunction(OP.toString(), this.left,this.right);
			this.left = f;
		}
		this.right = f1;
		this.OP = Operation.Plus;
	}

	@Override
	public void mul(function f1) {
		if ( this.right != null ) {
			function f = new ComplexFunction(OP.toString(), this.left,this.right);
			this.left = f;
		}
		this.right = f1;
		this.OP = Operation.Times;
	}

	@Override
	public void div(function f1) {
		if ( this.right != null ) {
			function f = new ComplexFunction(OP.toString(), this.left,this.right);
			this.left = f;
		}
		this.right = f1;
		this.OP = Operation.Divid;
	}

	@Override
	public void max(function f1) {
		if ( this.right != null ) {
			function f = new ComplexFunction(OP.toString(), this.left,this.right);
			this.left = f;
		}
		this.right = f1;
		this.OP = Operation.Max;
	}

	@Override
	public void min(function f1) {
		if ( this.right != null ) {
			function f = new ComplexFunction(OP.toString(), this.left,this.right);
			this.left = f;
		}
		this.right = f1;
		this.OP = Operation.Min;
	}

	@Override
	public void comp(function f1) {
		if ( this.right != null ) {
			function f = new ComplexFunction(OP.toString(), this.left,this.right);
			this.left = f;
		}
		this.right = f1;
		this.OP = Operation.Comp;
	}

	@Override
	public function left() {
		return this.left;
	}

	@Override
	public function right() {
		return this.right;
	}

	@Override
	public Operation getOp() {
		return this.OP;
	}
	
	// to finish
	@Override
	public boolean equals (Object other) {
	 if (other instanceof ComplexFunction) {
		 ComplexFunction cf = (ComplexFunction) other;
		 
	 }
	 return false;
	}

}
