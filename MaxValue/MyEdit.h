#if !defined(AFX_MYEDIT_H__A66576CE_8205_4970_9977_8E9D4C1771C2__INCLUDED_)
#define AFX_MYEDIT_H__A66576CE_8205_4970_9977_8E9D4C1771C2__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000
// MyEdit.h : header file
//

/////////////////////////////////////////////////////////////////////////////
// MyEdit window

class MyEdit : public CEdit
{
// Construction
public:
	MyEdit();

// Attributes
public:

// Operations
public:

// Overrides
	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(MyEdit)
	//}}AFX_VIRTUAL

// Implementation
public:
	virtual ~MyEdit();

	// Generated message map functions
protected:
	//{{AFX_MSG(MyEdit)
	afx_msg void OnChar(UINT nChar, UINT nRepCnt, UINT nFlags);
	//}}AFX_MSG

	DECLARE_MESSAGE_MAP()
};

/////////////////////////////////////////////////////////////////////////////

//{{AFX_INSERT_LOCATION}}
// Microsoft Visual C++ will insert additional declarations immediately before the previous line.

#endif // !defined(AFX_MYEDIT_H__A66576CE_8205_4970_9977_8E9D4C1771C2__INCLUDED_)
