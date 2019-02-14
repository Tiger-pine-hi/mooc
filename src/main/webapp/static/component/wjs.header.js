﻿define(['jquery', 'system', 'helper', 'userinfo', 'changepwd'], function ($, SystemConfig, helper, userinfo, changepwd) {

    var cwHeader = {};

    var headerHtml = '<div class="row">' +
                        '<div class="col-xs-6">' +
                            '<div class="logo" style="margin: 9px 10px;">' +
                                '<img src="/Modules/Component/Img/logo.png" style="height:20px;" />' +
                            '</div>' +
                            '<div class="title"style="margin-top: 7px;"><a href="" title="返回系统首页"></a></div>' +
                        '</div>' +
                        '<div class="col-xs-6">' +
                            '<div class="info" style="display:none; padding-top: 8px;">' +
                                '<div class="dropdown" style="display:inline-block;">' +
                                    '<a href="javascript:;" title="" class="dropdown-toggle congyerenyuan" data-toggle="dropdown" data-hover="dropdown" data-close-others="true" aria-expanded="true">' +
                                        '<i class="iconfont icon-congyerenyuan"></i>' +
                                    '</a>' +
                                    '<ul class="dropdown-menu dropdown-menu-default">' +
                                        '<li>' +
                                            '<div style="margin: 5px; text-align: center;">' +
                                                '<img alt="头像" src="/Modules/Component/Img/default_user.jpg" style="width: 60px; height: 60px; margin: 0;" />' +
                                            '</div>' +
                                        '</li>' +
                                        '<li>' +
                                            '<div style="margin: 5px;">' +
                                                '<div>用户名称：<b class="username"></b></div>' +
                                                '<div>组织名称：<b class="organizationname"></b></div>' +
                                            '<div>' +
                                        '</li>' +
                                        '<li>' +
                                            '<a class="UserInfo" href="javascript:;" style="text-align:center;">个人信息</a>' +
                                        '</li>' +
                                        '<li>' +
                                            '<a class="ChangePwd" href="javascript:;" style="text-align:center;">密码修改</a>' +
                                        '</li>' +
                                    '</ul>' +
                                '</div>' +
                                '<a class="fanhuixitongshouye" href="" title="返回系统首页">' +
                                    '<i class="iconfont icon-fanhuixitongshouye"></i>' +
                                '</a>' +
                                '<a class="tuichuxitong" href="javascript:void(0);" title="退出系统">' +
                                    '<i class="iconfont icon-tuichuxitong"></i>' +
                                '</a>' +
                            '</div>' +
                        '</div>' +
                    '</div>';

    cwHeader.SetHeaderInfo = function (result) {
        setHeader(result);
    };

    //设置头部信息
    var setHeader = function (result) {
        $(".page-header-inner").append(headerHtml);
        $('.page-header-inner .info .congyerenyuan').attr('title', result.body.UserName);
        $('.page-header-inner .info .username').text(result.body.UserName);
        $('.page-header-inner .info .organizationname').text(result.body.OrganizationName);

        $('.page-header-inner .logo img').attr('src', SystemConfig.SystemIcon);
        $('.page-header-inner .title a').attr('href', SystemConfig.DefaultUrl);
        $('.page-header-inner .title a').text(SystemConfig.SysName);
        $('.page-header-inner .info .fanhuixitongshouye').attr('href', SystemConfig.DefaultUrl);

        $('.page-header-inner .info').fadeIn('slow');

        $('.page-header-inner .info').on('click', '.tuichuxitong', function () {
            helper.Logout();
        });

        $('.page-header-inner .info').on('click', '.UserInfo', function () {
            userinfo.ShowUserInfo();
        });

        $('.page-header-inner .info').on('click', '.ChangePwd', function () {
            changepwd.ShowChangePwd();
        });
    };

    return cwHeader;
});