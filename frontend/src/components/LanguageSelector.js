import React from 'react';
import { withTranslation, WithTranslation } from 'react-i18next';
import { changeLanguage } from '../api/apiCalls';

const LanguageSelector = (props) => {

    const onChangeLanguage = language => {
        const { i18n } = this.props;
        i18n.changeLanguage(language);
        changeLanguage(language);
    };

    return (
        <div className='container'>
            <img height='24' width='24' src="https://countryflagsapi.com/png/turkey" alt="tr_flag" onClick={() => onChangeLanguage('tr')} style={{ cursor: 'pointer' }}></img>
            <img height='24' width='24' src="https://countryflagsapi.com/png/us" alt="us_flag" onClick={() => onChangeLanguage('en')} style={{ cursor: 'pointer' }}></img>
        </div>
    );
};

export default withTranslation()(LanguageSelector);