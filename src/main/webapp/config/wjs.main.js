var staticPath = "/static/",
    componentPath = staticPath + "component/",
    imgPath = staticPath + "img/",
    videoPath = staticPath +"video/";

require.config({
    baseUrl: '',
    paths: {
    //--------------------- 公用
        //系统配置
        "system": "/config/wjs.system",
        //bootstrap前端开发框架
        "bootstrap": componentPath + "bootstrap/js/bootstrap.min",
        //jquery
        "jquery": componentPath + "jquery/jquery-3.3.1.min"
        //
        // "jquery-ui": componentPath + "jquery-ui/jquery-ui.min",
        // //用于为 IE6-8 以及其它不支持 CSS3 Media Queries 的浏览器提供媒体查询的 min-width 和 max-width 特性，实现响应式网页设计（Responsive Web Design）。
        // "respond": componentPath + "respond.min",
        // //
        // "cokie": componentPath + "jquery.cokie.min",
        // "pin": componentPath + "jquery.pin",
        // 'json2': componentPath + 'json2',
        // 'md5': componentPath + 'md5',
        // 'login': "",
        // 'crypto': "",
        // 'fileupload': "",
        // "searchbox": "",
        // 'filelist': "",


    //--------------------- 用户前端
        // "datatables": componentPath + "datatables/media/js/jquery.dataTables.min",
        
        // "bootstrap-datepicker": "",
        // "bootstrap-datetimepicker": "",
        // 'bootstrap-datepicker.zh-CN': "",
        // 'bootstrap-datetimepicker.zh-CN': "",

    //-------------------- 管理员后台
        // 'jstree':"",
        // 'bootstrap-switch': ""
        


    },
    shim: {
        // 'vms': {
        //     deps: ['jquery', 'Cbers']
        // },
        // 'CbersMap': {
        //     deps: ['jquery', 'Cbers', 'vms']
        // },
        // "helper": {
        //     deps: ['system', 'cokie'],
        // },
        // "jquery-migrate": ['jquery'],
        // "pin": ['jquery'],
        // "jquery-ui": ['jquery', 'jquery-migrate'],
        // "uniform": ['jquery', 'jquery-migrate'],
        // "layout": {
        //     deps: ['jquery', 'jquery-migrate', 'metronic'],
        //     exports: "Layout"
        // },
        // "queueutility": ['jquery', 'jquery-migrate'],
        // 'dataTables.bootstrap': {
        //     deps: ['jquery', 'jquery-migrate', 'bootstrap', 'datatables']
        // },
        // "customtable": {
        //     deps: ['dataTables.bootstrap', 'helper', 'uniform']
        // },
        // "blockui": {
        //     deps: ['jquery', 'bootstrap-toastr'],
        //     exports: 'jquery.blockui'
        // },
        // "metronic": {
        //     deps: ['jquery', 'jquery-migrate', 'bootstrap', 'bootstrap-toastr', 'blockui', 'slimscroll'],
        //     exports: "Metronic"
        // },
        "bootstrap": ['jquery']
        // "bootstrap-modal": {
        //     deps: ['jquery', 'jquery-migrate', 'bootstrap'],
        //     exports: "Modal"
        // },
        // "bootstrap-modalmanager": {
        //     deps: ['jquery', 'jquery-migrate', 'bootstrap'],
        //     exports: "ModalManager"
        // },
        // "bootbox": {
        //     deps: ['jquery', 'jquery-migrate', 'bootstrap'],
        //     exports: "bootbox"
        // },
        // "popdialog": {
        //     deps: ['jquery', 'jquery-migrate', 'bootstrap']
        // },
        // "tipdialog": {
        //     deps: ['jquery', 'jquery-migrate', 'bootstrap', "bootstrap-modal", "bootstrap-modalmanager"]
        // },
        // "slimscroll": {
        //     deps: ['jquery']
        // },
        // "bootstrap-datepicker": {
        //     deps: ['jquery']
        // },
        // "bootstrap-datetimepicker": {
        //     deps: ['jquery']
        // },
        // "bootstrap-datepicker.zh-CN": {
        //     deps: ['bootstrap-datepicker']
        // },
        // "bootstrap-datetimepicker.zh-CN": {
        //     deps: ['bootstrap-datetimepicker']
        // }
    }
});

// require(['jquery', 'helper'], function ($, t) {

//     if (t.BrowserVersion.browser == "IE" && t.BrowserVersion.version == 8) {
//         require(['respond', 'excanvas']);
//     };

//     //无需登录页面需加标记：<meta property="login" content="false" />
//     if ($("meta[property=login]").attr('content') !== 'false') {
//         t.PageLogin();
//     };

//     if ($('.page-sidebar-icon').length > 0 && $('.page-sidebar-menu').length == 0) {
//         t.UserMenu();
//     };

//     if ($('.page-header-inner').length > 0 && $('.page-sidebar-menu .row').length == 0) {
//         t.Header();
//     };

// });
