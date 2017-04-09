<%-- 
    Document   : headeruser
    Created on : Apr 9, 2017, 11:42:01 AM
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
