<%-- 
    Document   : header
    Created on : Apr 6, 2017, 3:42:37 PM
    Author     : duonghan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <div class="modal fade" id="myModal88" tabindex="-1" role="dialog" aria-labelledby="myModal88"
		aria-hidden="true">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;</button>
					<h4 class="modal-title" id="myModalLabel">
						Chào mừng đến với DN Shop!</h4>
				</div>
				<div class="modal-body modal-body-sub">
					<div class="row">
						<div class="col-md-8 modal_body_left modal_body_left1" style="border-right: 1px dotted #C2C2C2;padding-right:3em;">
							<div class="sap_tabs">	
								<div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
									<ul>
										<li class="resp-tab-item" aria-controls="tab_item-0"><span>Đăng nhập</span></li>
										<li class="resp-tab-item" aria-controls="tab_item-1"><span>Đăng ký</span></li>
									</ul>		
									<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
										<div class="facts">
											<div class="register">
												<form action="#" method="post">			
													<input name="Email" placeholder="Địa chỉ E-mail" type="text" required="">						
													<input name="Password" placeholder="Mật khẩu" type="password" required="">										
													<div class="sign-up">
														<input type="submit" value="Đăng nhập"/>
													</div>
												</form>
											</div>
										</div> 
									</div>	

									<div class="tab-2 resp-tab-content" aria-labelledby="tab_item-1">
										<div class="facts">
											<div class="register">
												<form action="#" method="post">			
													<input placeholder="Tên người dùng" name="Name" type="text" required="">
													<input placeholder="Địa chỉ E-mail" name="Email" type="email" required="">	
													<input placeholder="Mật khẩu" name="Password" type="password" required="">	
													<input placeholder="Xác nhận mật khẩu" name="Password" type="password" required="">
													<div class="sign-up">
														<input type="submit" value="Tạo tài khoản"/>
													</div>
												</form>
											</div>
										</div>
									</div> 			        					            	      
								</div>	
							</div>
							<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
							<script type="text/javascript">
								$(document).ready(function () {
									$('#horizontalTab').easyResponsiveTabs({
										type: 'default', //Types: default, vertical, accordion           
										width: 'auto', //auto or any width like 600px
										fit: true   // 100% fit in a container
									});
								});
							</script>
							<div id="OR" class="hidden-xs">
								hoặc</div>
						</div>
						<div class="col-md-4 modal_body_right modal_body_right1">
							<div class="row text-center sign-with">
								<div class="col-md-12">
									<h3 class="other-nw">
										Đăng nhập qua</h3>
								</div>
								<div class="col-md-12">
									<ul class="social">
										<li class="social_facebook"><a href="#" class="entypo-facebook"></a></li>
										<li class="social_dribbble"><a href="#" class="entypo-dribbble"></a></li>
										<li class="social_twitter"><a href="#" class="entypo-twitter"></a></li>
										<li class="social_behance"><a href="#" class="entypo-behance"></a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
		$('#myModal88').modal('show');
	</script>
	<div class="header">
		<div class="container">
			<div class="w3l_login">
				<a href="#" data-toggle="modal" data-target="#myModal88"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></a>
			</div>
			<div class="w3l_logo">
				<h1><a href="index.html">DN Sport Shoe<span>For Shoe Lovers</span></a></h1>
			</div>
			<div class="search">
				<input class="search_box" type="checkbox" id="search_box">
				<label class="icon-search" for="search_box"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></label>
				<div class="search_form">
					<form action="#" method="post">
						<input type="text" name="Search" placeholder="Tìm kiếm...">
						<input type="submit" value="Send">
					</form>
				</div>
			</div>
			<div class="cart box_1">
				<a href="checkout.html">
					<div class="total">
					<span class="simpleCart_total"></span> (<span id="simpleCart_quantity" class="simpleCart_quantity"></span> mặt hàng)</div>
					<img src="images/bag.png" alt="" />
				</a>
				<p><a href="javascript:;" class="simpleCart_empty">Giỏ hàng trống</a></p>
				<div class="clearfix"> </div>
			</div>	
			<div class="clearfix"> </div>
		</div>
	</div>
	<div class="navigation">
		<div class="container">
			<nav class="navbar navbar-default">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header nav_2">
					<button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div> 
				<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
					<ul class="nav navbar-nav">
						<li class="active"><a href="index.html" class="act">Trang chủ</a></li>	
						<!-- Mega Menu -->
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Sản phẩm <b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-3">
								<div class="row">
									<div class="col-sm-3">
										<ul class="multi-column-dropdown">
											<h6>Nike</h6>
											<li><a href="dresses.html">Dresses<span>New</span></a></li>
											<li><a href="sweaters.html">Sweaters</a></li>
											<li><a href="skirts.html">Shorts & Skirts</a></li>
											<li><a href="nike-airforce.html">Nike Air Force</a></li>
											<li><a href="shirts.html">Shirts & Tops<span>New</span></a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<ul class="multi-column-dropdown">
											<h6>Converse</h6>
											<li><a href="salwars.html">Salwars</a></li>
											<li><a href="sarees.html">Sarees<span>New</span></a></li>
											<li><a href="sarees.html">Sarees<span>New</span></a></li>
											<li><a href="sarees.html">Sarees<span>New</span></a></li>
											<li><a href="sarees.html">Sarees<span>New</span></a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<ul class="multi-column-dropdown">
											<h6>Adidas</h6>
											<li><a href="sandals.html">Flats</a></li>
											<li><a href="sandals.html">Sandals</a></li>
											<li><a href="sandals.html">Boots</a></li>
											<li><a href="sandals.html">Heels</a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<ul class="multi-column-dropdown">
											<h6>Vans</h6>
											<li><a href="sandals.html">Flats</a></li>
											<li><a href="sandals.html">Sandals</a></li>
											<li><a href="sandals.html">Boots</a></li>
											<li><a href="sandals.html">Heels</a></li>
										</ul>
									</div>
									<div class="clearfix"></div>
								</div>
							</ul>
						</li>
						<li><a href="about.html">Giới thiệu</a></li>
						<li><a href="mail.html">Liên Hệ</a></li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
        
    </body>
</html>
