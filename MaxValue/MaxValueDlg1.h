#if !defined(AFX_MAXVALUEDLG1_H__6A912536_65FD_40A2_A8C1_AD57E6E34D52__INCLUDED_)
#define AFX_MAXVALUEDLG1_H__6A912536_65FD_40A2_A8C1_AD57E6E34D52__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000
// MaxValueDlg1.h : header file
//

/////////////////////////////////////////////////////////////////////////////
// MaxValueDlg dialog

class MaxValueDlg : public CDialog
{
// Construction
public:
	MaxValueDlg(CWnd* pParent = NULL);   // standard constructor

// Dialog Data
	//{{AFX_DATA(MaxValueDlg)
	enum { IDD = IDD_DIALOGBAR };
		// NOTE: the ClassWizard will add data members here
	//}}AFX_DATA


// Overrides
	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(MaxValueDlg)
	protected:
	virtual void DoDataExchange(CDataExchange* pDX);    // DDX/DDV support
	//}}AFX_VIRTUAL

// Implementation
protected:

	// Generated message map functions
	//{{AFX_MSG(MaxValueDlg)
		// NOTE: the ClassWizard will add member functions here
	//}}AFX_MSG
	DECLARE_MESSAGE_MAP()
};

//{{AFX_INSERT_LOCATION}}
// Microsoft Visual C++ will insert additional declarations immediately before the previous line.

#endif // !defined(AFX_MAXVALUEDLG1_H__6A912536_65FD_40A2_A8C1_AD57E6E34D52__INCLUDED_)
