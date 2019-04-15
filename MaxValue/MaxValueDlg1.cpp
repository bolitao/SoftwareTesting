// MaxValueDlg1.cpp : implementation file
//

#include "stdafx.h"
#include "MaxValue.h"
#include "MaxValueDlg1.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#undef THIS_FILE
static char THIS_FILE[] = __FILE__;
#endif

/////////////////////////////////////////////////////////////////////////////
// MaxValueDlg dialog


MaxValueDlg::MaxValueDlg(CWnd* pParent /*=NULL*/)
	: CDialog(MaxValueDlg::IDD, pParent)
{
	//{{AFX_DATA_INIT(MaxValueDlg)
		// NOTE: the ClassWizard will add member initialization here
	//}}AFX_DATA_INIT
}


void MaxValueDlg::DoDataExchange(CDataExchange* pDX)
{
	CDialog::DoDataExchange(pDX);
	//{{AFX_DATA_MAP(MaxValueDlg)
		// NOTE: the ClassWizard will add DDX and DDV calls here
	//}}AFX_DATA_MAP
}


BEGIN_MESSAGE_MAP(MaxValueDlg, CDialog)
	//{{AFX_MSG_MAP(MaxValueDlg)
		// NOTE: the ClassWizard will add message map macros here
	//}}AFX_MSG_MAP
END_MESSAGE_MAP()

/////////////////////////////////////////////////////////////////////////////
// MaxValueDlg message handlers
