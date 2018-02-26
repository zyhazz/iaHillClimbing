<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>IAWeb</title>
<%@ include file="parts/header.jsp"%>
</head>
<body>
	<div class="container">
		<div class="view">
			<div class="pages" width="500px">
				<?xml version="1.0" encoding="UTF-8"?>
				<svg xmlns="http://www.w3.org/2000/svg"
					viewBox="0 0 400 400" width="100%" height="100%">
<defs>
	<g id="queen">
		<svg xmlns="http://www.w3.org/2000/svg" version="1.1" width="45"
						height="45">
		  <g
							style="opacity:1; fill:#ffffff; fill-opacity:1; fill-rule:evenodd; stroke:#000000; stroke-width:1.5; stroke-linecap:round;stroke-linejoin:round;stroke-miterlimit:4; stroke-dasharray:none; stroke-opacity:1;">
		    <path d="M 9 13 A 2 2 0 1 1  5,13 A 2 2 0 1 1  9 13 z"
							transform="translate(-1,-1)" />
		    <path d="M 9 13 A 2 2 0 1 1  5,13 A 2 2 0 1 1  9 13 z"
							transform="translate(15.5,-5.5)" />
		    <path d="M 9 13 A 2 2 0 1 1  5,13 A 2 2 0 1 1  9 13 z"
							transform="translate(32,-1)" />
		    <path d="M 9 13 A 2 2 0 1 1  5,13 A 2 2 0 1 1  9 13 z"
							transform="translate(7,-4.5)" />
		    <path d="M 9 13 A 2 2 0 1 1  5,13 A 2 2 0 1 1  9 13 z"
							transform="translate(24,-4)" />
		    <path
							d="M 9,26 C 17.5,24.5 30,24.5 36,26 L 38,14 L 31,25 L 31,11 L 25.5,24.5 L 22.5,9.5 L 19.5,24.5 L 14,10.5 L 14,25 L 7,14 L 9,26 z "
							style="stroke-linecap:butt;" />
		    <path
							d="M 9,26 C 9,28 10.5,28 11.5,30 C 12.5,31.5 12.5,31 12,33.5 C 10.5,34.5 10.5,36 10.5,36 C 9,37.5 11,38.5 11,38.5 C 17.5,39.5 27.5,39.5 34,38.5 C 34,38.5 35.5,37.5 34,36 C 34,36 34.5,34.5 33,33.5 C 32.5,31 32.5,31.5 33.5,30 C 34.5,28 36,28 36,26 C 27.5,24.5 17.5,24.5 9,26 z "
							style="stroke-linecap:butt;" />
		    <path d="M 11.5,30 C 15,29 30,29 33.5,30" style="fill:none;" />
		    <path d="M 12,33.5 C 18,32.5 27,32.5 33,33.5" style="fill:none;" />
		  </g>
		</svg>
	</g>
	<g id="hits">
		<svg width="50" height="50">
  		<rect x="0" y="0" width="50" height="50" stroke="red"
							stroke-width="3px" fill="white" fill-opacity="0.4" />
  		<text x="50%" y="50%" alignment-baseline="middle"
							text-anchor="middle" fill="red" id="valor">x</text>    
	</svg>
	</g>
</defs>
<g>
	<svg viewBox="0 0 8 8">
	<rect x="0" y="0" width="8" height="8" fill="black" />
	<path fill="#FFF" d="M0,0H1V1H0z" id="a1" />
	<path fill="#FFF" d="M0,2H1V3H0z" id="a3" />
	<path fill="#FFF" d="M0,4H1V5H0z" id="a5" />
	<path fill="#FFF" d="M0,6H1V7H0z" id="a7" />

	<path fill="#FFF" d="M1,1H2V2H1z" id="b2" />
	<path fill="#FFF" d="M1,3H2V4H1z" id="b4" />
	<path fill="#FFF" d="M1,5H2V6H1z" id="b6" />
	<path fill="#FFF" d="M1,7H2V8H1z" id="b8" />

	<path fill="#FFF" d="M2,0H3V1H2z" id="c1" />
	<path fill="#FFF" d="M2,2H3V3H2z" id="c3" />
	<path fill="#FFF" d="M2,4H3V5H2z" id="c5" />
	<path fill="#FFF" d="M2,6H3V7H2z" id="c7" />

	<path fill="#FFF" d="M3,1H4V2H3z" id="d1" />
	<path fill="#FFF" d="M3,3H4V4H3z" id="d3" />
	<path fill="#FFF" d="M3,5H4V6H3z" id="d5" />
	<path fill="#FFF" d="M3,7H4V8H3z" id="d7" />

	<path fill="#FFF" d="M4,0H5V1H4z" id="e1" />
	<path fill="#FFF" d="M4,2H5V3H4z" id="e3" />
	<path fill="#FFF" d="M4,4H5V5H4z" id="e5" />
	<path fill="#FFF" d="M4,6H5V7H4z" id="e7" />

	<path fill="#FFF" d="M5,1H6V2H5z" id="f1" />
	<path fill="#FFF" d="M5,3H6V4H5z" id="f3" />
	<path fill="#FFF" d="M5,5H6V6H5z" id="f5" />
	<path fill="#FFF" d="M5,7H6V8H5z" id="f7" />

	<path fill="#FFF" d="M6,0H7V1H6z" id="g1" />
	<path fill="#FFF" d="M6,2H7V3H6z" id="g3" />
	<path fill="#FFF" d="M6,4H7V5H6z" id="g5" />
	<path fill="#FFF" d="M6,6H7V7H6z" id="g7" />

	<path fill="#FFF" d="M7,1H8V2H7z" id="h1" />
	<path fill="#FFF" d="M7,3H8V4H7z" id="h3" />
	<path fill="#FFF" d="M7,5H8V6H7z" id="h5" />
	<path fill="#FFF" d="M7,7H8V8H7z" id="h7" />
</svg>
</g>

<g>
	<svg viewBox="-2.5 -2.5 402.5 402.5">
		<use id="q0" x="0" y="0" href="#queen" style="fill: black;" />
		<use id="q1" x="50" y="0" href="#queen" style="fill: black;" />
		<use id="q2" x="100" y="0" href="#queen" style="fill: black;" />
		<use id="q3" x="150" y="0" href="#queen" style="fill: black;" />
		<use id="q4" x="200" y="0" href="#queen" style="fill: black;" />
		<use id="q5" x="250" y="0" href="#queen" style="fill: black;" />
		<use id="q6" x="300" y="0" href="#queen" style="fill: black;" />
		<use id="q7" x="350" y="0" href="#queen" style="fill: black;" />
	</svg>
</g>

<g id="layer_hits">
	<!--  <use x="0" y="0" href="#hits" style="fill: black;" />  -->
	
</g>

</svg>


			</div>
		</div>
	</div>
	<script type="text/javascript">
	
	function infoBox(row, col, text, val){
		var fill = (val == text)?"#f00":"#fff";
		s = Snap(50,50);
		g = s.group(s.rect(0,0,50,50).attr({
		    fill: fill,
		    stroke: "#000",
		    "fill-opacity": "0.4",
		    strokeWidth: 5,
		    
		}));
		g.add(s.text('50%','50%',text).attr({
		    "alignment-baseline": "middle",
		    "text-anchor": "middle",
		    fill: "red"
		}));
		gx = layer_hits.group(s);
		gx.transform("t"+ row * 50 +"," + col * 50);
	}
	function moveQueen(col,row){
		window["q" + col].animate({y:50 * row},1000);
	}
	
	function doScaledTimeout(row, col, i, m, val) {
		  setTimeout(function() {
			  moveQueen(row,col);
			  doMatrix(m, val);
		  }, (i + 1) * 2000);
	}
	function doMatrix(board, val){
		$("#layer_hits").empty();
		for(var i = 0; i < board.length; i++){
			for(var j = 0; j < board[i].length; j++){
				infoBox(i,j,board[i][j], val);
			}
		}
	}
	
	var q0,q1,q2,q3,q4,q5,q6,q7,layer_hits;
	var ip = ${queens1};
	var board1 = ${board1};
	//var board2 = ${board2};
	
	var solution = ${solution};
	//var total2 = ${total2};
	
	$(document).ready(function() {
		layer_hits = Snap("#layer_hits");
		
		q0 = Snap("#q0");
		q1 = Snap("#q1");
		q2 = Snap("#q2");
		q3 = Snap("#q3");
		q4 = Snap("#q4");
		q5 = Snap("#q5");
		q6 = Snap("#q6");
		q7 = Snap("#q7");
		
		//teste posicao inicial
		q0.animate({y:50*ip[0]},1000);
		q1.animate({y:50*ip[1]},1000);
		q2.animate({y:50*ip[2]},1000);
		q3.animate({y:50*ip[3]},1000);
		q4.animate({y:50*ip[4]},1000);
		q5.animate({y:50*ip[5]},1000);
		q6.animate({y:50*ip[6]},1000);
		q7.animate({y:50*ip[7]},1000);
		
		doMatrix(board1);
		
		for(var i = 0; i < solution.length; i++){
			doScaledTimeout(solution[i].row,solution[i].col,i, solution[i].matrix, solution[i].h);
		}
		
		
	});
	</script>
	
	<%@ include file="parts/footer.jsp"%>
</body>