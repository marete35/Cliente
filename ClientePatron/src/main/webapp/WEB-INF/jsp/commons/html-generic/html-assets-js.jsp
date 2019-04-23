<!-- JSP que carga archivo javascripts" -->
<script>
	var __code = '<c:out value="${pageContext.session.id}"/>';
	var base_url = '<c:out value="${baseUrl}"/>';
</script>

<script src="<c:url value="/resources/js/commons/logger.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/lib/jQuery/jquery-1.11.1.min.js?version=${ version }" />"></script>
<script src='<c:url value="/resources/js/lib/jQuery/jquery-ui-1.12.1.min.js?version=${ version }" />'></script>

<script src="<c:url value="/resources/js/lib/bootstrap/bootstrap.min.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/lib/fontAwesome/fa-solid.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/lib/calendar/moment.min.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/commons/dates.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/lib/calendar/daterangepicker.min.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/lib/dataTables/datatables.min.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/lib/chart/Chart.min.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/lib/download/jquery.fileDownload.js?version=${ version }" />"></script>
<script src="${ urlSDK }"></script>
<script src="${ urlMktSDK }"></script>
<%-- <script src="<c:url value="/resources/js/bqbsdk.js" />"></script> --%>

<%--<script src="<c:url value="/resources/js/jquery.validate.min.js" />"></script> --%>
<script src="<c:url value="/resources/js/lib/jQueryValidate/jquery.validate.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/lib/jQueryValidate/additional-methods.min.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/commons/common.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/commons/initSDK.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/lib/json/taffy-min.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/commons/componentButtonsInline.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/commons/componentDeleteDialog.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/commons/componentMessage.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/commons/componentErrorDialog.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/commons/componentDataTable.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/commons/componentHistory.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/commons/componentLanguage.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/commons/componentCheck.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/lib/aCollapTable/jquery.aCollapTable.min.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/commons/componentLoading.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/commons/componentLoadingBar.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/lib/dataTables/dataTables.rowsGroup.js?version=${ version }" />"></script>



<%-- Menu --%>
<script src="<c:url value="/resources/js/lib/bootstrap/jquery.smartmenus.min.js?version=${ version }" />"></script>
<script src="<c:url value="/resources/js/lib/bootstrap/jquery.smartmenus.bootstrap.min.js?version=${ version }" />"></script>