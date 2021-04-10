<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/movie.css">
<link rel="stylesheet" href="../css/main.css">
<style>
</style>
<script type="text/javascript">
	function get() {
		alert("장바구니에 추가되었습니다.");
	}
	function down() {
		alert("결제 해주세요.");
	}
</script>
</head>
<body>

<div id="nav">

        <a href="netmain.html" id="logo"><img class="logo" src="../images1/넷플릭.JPG"></a>
        <ul id="na">
            <li class="av"><a href="영화.html">영화보기</a></li>
            <li class="av"><a href="다운로드.html">다운로드</a></li>
            <li class="av"><a href="다운로드.html">커뮤니티</a></li>
          
            <li class="av"><a href="index.html">고객센터</a></li>
        <a href="마이페이지.html" id="search"><img class="search1" src="../images1/닷지차저.jpg"></a>
        <a type="button" href="#" id="search"><img class="search" src="../images1/장바구니흰.jpg"></a>
        <a type="button" href="#" id="search"><img class="search" src="../images1/흰돋보기.JPG"></a>
                <input type="text" id="searchDown" placeholder="콘텐츠 검색" value="" class="MuiInputBase-input-128 MuiInput-input-116 jss86 jss96 jss77 MuiInputBase-inputAdornedStart-132">
        </ul>
        
    </div>
	
	
	<div class="movielist">
		<a href="상세보기.html"><img class="movie" alt=""
			src="https://dnm.nflximg.net/api/v6/evlCitJPPCVCry0BZlEFb5-QjKc/AAAABa3bDsaWb7kOaKq3R8eoeKyi8c17KP8UMdgaX2PWFbjqajJU0aV0RovvmZWGGs5-hNErFD9jshXA_zogRP9vt110tAfPlIQUMHk0km3NT2i5QBsRVHTXeuFuOCt6kA.jpg?r=e24"></a>
		<br>
		<button class="mbutton" type="button" onclick="get()">
			<img class="cart" src="../images1/장바구니.png">담기
		</button>
		<button class="mbutton" type="button" onclick="down()">
			<img class="cart" src="../images1/다운로드.png">다운로드
		</button>
	</div>
	
	<div class="movielist">
		<img class="movie" alt=""
			src="https://dnm.nflximg.net/api/v6/evlCitJPPCVCry0BZlEFb5-QjKc/AAAABXLbm6xVQwnr98PcT0la4-inW-XZ_AGKvBAnlflpHUawmCGqTIfs49kM1Qj64Go18qUzSCMjIzRLPc-hlgN2rZUiv-9E-DFl04b1x5piY9rt6lJTsxlwwG571QACtQ.jpg?r=c2b"><br>
		<button class="mbutton" type="button" onclick="get()">
			<img class="cart" src="../images1/장바구니.png">담기
		</button>
		<button class="mbutton" type="button" onclick="down()">
			<img class="cart" src="../images1/다운로드.png">다운로드
		</button>
	</div>

	<div class="movielist">
		<img class="movie" alt=""
			src="https://dnm.nflximg.net/api/v6/evlCitJPPCVCry0BZlEFb5-QjKc/AAAABeaIQcWmnbpnHBqeA6-CwkkvITfW_lFGqxP5QHUHwH1wvCBo0_DfrZ2GTzxopAcyKzU4WArDJdPvYBT4D-rTgM9pbUybmRZh9NaBVN_ybDlq6eMRH-q3S1yYHBLPzQ.jpg?r=410">
		<br> 
		<button type="button" onclick="get()">
			<img class="cart" src="../images1/장바구니.png">담기
		</button>
		<button class="mbutton" type="button" onclick="down()">
			<img class="cart" src="../images1/다운로드.png">다운로드
		</button>
	</div>

	<div class="movielist">
		<img class="movie" alt=""
			src="https://d2ajy4iry6zk4j.cloudfront.net/pubvat/81316256/thumbnail/small/pkwbjpktu">
		<br>
		<button type="button" onclick="get()">
			<img class="cart" src="../images1/장바구니.png">담기
		</button>
		<button class="mbutton" type="button" onclick="down()">
			<img class="cart" src="../images1/다운로드.png">다운로드
		</button>
	</div>
<!-- 5 -->
	<div class="movielist">
		<img class="movie" alt=""
			src="https://dnm.nflximg.net/api/v6/evlCitJPPCVCry0BZlEFb5-QjKc/AAAABR10-pWqcdEPv25KXztsTiwecuOr7GLKtzmGVOsSPz10FVR5pL_RszIHyTBc70eJBdeoJvhIKHuhwQLoBgJ-DFwSa6bqN0-JctPWJLZsxYAP5-xSd7u4k9ug3P33_w.jpg?r=aa5">
		<br>
		<button type="button" onclick="get()">
			<img class="cart" src="../images1/장바구니.png">담기
		</button>
		<button class="mbutton" type="button" onclick="down()">
			<img class="cart" src="../images1/다운로드.png">다운로드
		</button>
	</div>
<!-- 6 -->
	<div class="movielist">
		<img class="movie" alt=""
			src="https://dnm.nflximg.net/api/v6/evlCitJPPCVCry0BZlEFb5-QjKc/AAAABZnVWaTFVBY97Kta7QRFVHDhb1fQpPXGVTKFwuGgoLDLpCtoeYUhC3fG34N0s_H0LD6thJJdCftzy6Paad2yoKVv7rUdBmNvWsMk21OIn_vydJUsGsLsLwfMdFHf1Q.jpg?r=2f4">
		<br>
		<button class="mbutton" type="button" onclick="get()">
			<img class="cart" src="../images1/장바구니.png">담기
		</button>
		<button class="mbutton" type="button" onclick="down()">
			<img class="cart" src="../images1/다운로드.png">다운로드
		</button>
	</div>
<!-- 7 -->
<div class="movielist">
		<img class="movie" alt=""
			src="https://dnm.nflximg.net/api/v6/evlCitJPPCVCry0BZlEFb5-QjKc/AAAABV7X-bJIYpmiB6l9kVI-x965yAFpGxhh2aGjrpWlSAdg53VNImKO24DzlD2V3WlXzYzzTnBDEcDBm7H3E2lqC41-lsirJrv1Tp-3_g7-UGp2nwZ4yNeeq1B6dN3G6A.jpg?r=c05">
		<br>
		<button class="mbutton" type="button" onclick="get()">
			<img class="cart" src="../images1/장바구니.png">담기
		</button>
		<button class="mbutton" type="button" onclick="down()">
			<img class="cart" src="../images1/다운로드.png">다운로드
		</button>
	</div>
<!-- 	8 -->
	<div class="movielist">
		<img class="movie" alt=""
			src="https://dnm.nflximg.net/api/v6/evlCitJPPCVCry0BZlEFb5-QjKc/AAAABc2WcODYeQxd1KDLsTwxXxALEg-8YW5sdnxdKhu38AB_b4OwhEKaylDy1USdRKlOb_Vgn6E6p0GLedYekjOFOXjqKTm_RGfytjAKJF0QlBQhB7LYcpEpJ2up97sKmg.jpg?r=b36">
		<br>
		<button class="mbutton" type="button" onclick="get()">
			<img class="cart" src="../images1/장바구니.png">담기
		</button>
		<button class="mbutton" type="button" onclick="down()">
			<img class="cart" src="../images1/다운로드.png">다운로드
		</button>
	</div>
<!-- 	9 -->
	<div class="movielist">
		<img class="movie" alt=""
			src="https://dnm.nflximg.net/api/v6/evlCitJPPCVCry0BZlEFb5-QjKc/AAAABfz998oHtJdHcEvKWP8cRm3VNQ5stUXz_EbYE-fqd3F664QGfhbnmFgg4WMUaq5GS8mR_7KOgQZYQ5182sG3tYT-d9d0RMzGfwh4-0SvMeOfomTESsIHYnULuNJGSA.jpg?r=14f">
		<br>
		<button class="mbutton" type="button" onclick="get()">
			<img class="cart" src="../images1/장바구니.png">담기
		</button>
		<button class="mbutton" type="button" onclick="down()">
			<img class="cart" src="../images1/다운로드.png">다운로드
		</button>
	</div>
<!-- 	10 -->
	<div class="movielist">
		<img class="movie" alt=""
			src="https://dnm.nflximg.net/api/v6/evlCitJPPCVCry0BZlEFb5-QjKc/AAAABZrRHH_QzF51qBXTDzjXjKvAl_lZZdL9emqVQA444CHlbarL00Bvgkv9yDuC9Bt8fZw9DtiwZXQ44G_fs_T7J5cJT2JIidPF2qEO1bJ91DiG2sHgaq_lX6DXqKEucw.jpg?r=5a1">
		<br>
		<button class="mbutton" type="button" onclick="get()">
			<img class="cart" src="../images1/장바구니.png">담기
		</button>
		<button class="mbutton" type="button" onclick="down()">
			<img class="cart" src="../images1/다운로드.png">다운로드
		</button>
	</div>
	
	
</body>
</html>